package theuniversalgraph.api.rest.converter;

import org.springframework.stereotype.Service;
import theuniversalgraph.api.rest.dto.NodeDto;
import theuniversalgraph.api.rest.entity.NodeEntity;

@Service
public class NodeConverter extends AbstractConverter<NodeEntity, NodeDto> {

    @Override
    public void toDto(final NodeEntity entity, final NodeDto dto) {

        dto.setId(entity.getId());
        dto.setContenttype(entity.getContent());
        dto.setContent(entity.getContent());
        if(entity.getChildrenEntity() != null){
            entity.getChildrenEntity().forEach(
                    children -> dto.getChildren().add(this.toDto(children))
            );
        }
        if(entity.getParentsEntity() != null){
            entity.getParentsEntity().forEach(
                    parents -> dto.getParents().add(this.toDto(parents))
            );
        }

    }

    @Override
    public void fromDto(final NodeEntity entity, final NodeDto dto) {

        entity.setId(dto.getId());
        entity.setContentType(dto.getContenttype());
        entity.setContent(dto.getContent());
        if(dto.getChildren() != null){
            dto.getChildren().forEach(
                    children -> entity.getChildrenEntity().add(this.fromDto(children))
            );
        }
        if(dto.getParents() != null){
            dto.getParents().forEach(
                    parents -> entity.getParentsEntity().add(this.fromDto(parents))
            );
        }
    }
}
