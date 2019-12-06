package preorder.controllers;

import com.epam.template.preorder.PreorderDto;
import com.epam.template.preorder.PreorderResource;
import io.swagger.annotations.Api;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;
import preorder.model.PreorderEntity;
import preorder.repositories.PreorderRepository;

@Api
@RestController
public class PreorderController implements PreorderResource {
    @Autowired
    private PreorderRepository preorderRepository;

    @Autowired
    private ModelMapper modelMapper;

    public PreorderDto createPreorder(PreorderDto preorderDto) {
        PreorderEntity entity = modelMapper.map(preorderDto, PreorderEntity.class);
        PreorderEntity savedEntity = preorderRepository.save(entity);
        return modelMapper.map(savedEntity, PreorderDto.class);
    }

    public ResponseEntity<PreorderDto> getPreorder(Long id) {
        PreorderDto dto = preorderRepository.findById(id)
                .map(e -> modelMapper.map(e, PreorderDto.class))
                .orElse(null);
        if (dto == null) {
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok(dto);
    }

    public ResponseEntity<PreorderDto> updatePreorder(Long id, PreorderDto preorderDto) {
        PreorderEntity entity = preorderRepository.findById(id)
                .orElse(null);
        if (entity == null) {
            return ResponseEntity.badRequest().build();
        }
        modelMapper.map(preorderDto, entity);
        PreorderEntity savedEntity = preorderRepository.save(entity);
        return ResponseEntity.ok(modelMapper.map(savedEntity, PreorderDto.class));
    }

    public void deletePreorder(Long id) {
        preorderRepository.deleteById(id);
    }
}
