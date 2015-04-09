package theuniversalgraph.api.rest.converter;

import java.lang.reflect.ParameterizedType;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public abstract class AbstractConverter<EntityClass, DtoClass> {

    private final Class<EntityClass> entityClass;
    private final Class<DtoClass> dtoClass;

    @SuppressWarnings("unchecked")
    public AbstractConverter() {
        final ParameterizedType genericSuperclass = (ParameterizedType) getClass().getGenericSuperclass();
        this.entityClass = (Class<EntityClass>) genericSuperclass.getActualTypeArguments()[0];
        this.dtoClass = (Class<DtoClass>) genericSuperclass.getActualTypeArguments()[1];
    }

    protected DtoClass newDto() {
        try {
            return dtoClass.newInstance();
        } catch (InstantiationException | IllegalAccessException e) {
            throw new RuntimeException(e);
        }
    }

    protected EntityClass newEntity() {
        try {
            return entityClass.newInstance();
        } catch (InstantiationException | IllegalAccessException e) {
            throw new RuntimeException(e);
        }
    }

    public abstract void toDto(final EntityClass entity, final DtoClass dto);

    public DtoClass toDto(final EntityClass entity) {
        if (entity == null) {
            return null;
        }
        final DtoClass dto = newDto();
        toDto(entity, dto);
        return dto;
    }

    public List<DtoClass> toDto(final Collection<? extends EntityClass> entities) {
        final List<DtoClass> dtoCollection = new ArrayList<>();
        entities.forEach(entity -> dtoCollection.add(toDto(entity)));
        return dtoCollection;
    }

    public abstract void fromDto(final EntityClass entity, final DtoClass dto);


    public EntityClass fromDto(final DtoClass dto) {
        final EntityClass entity = newEntity();
        fromDto(entity, dto);
        return entity;
    }
}
