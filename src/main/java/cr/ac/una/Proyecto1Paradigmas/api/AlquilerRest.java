package cr.ac.una.Proyecto1Paradigmas.api;

import cr.ac.una.Proyecto1Paradigmas.entity.Alquiler;
import cr.ac.una.Proyecto1Paradigmas.repository.AlquilerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(path="/alquiler")
public class AlquilerRest {
    @Autowired
    private AlquilerRepository alquilerRepository;

    @GetMapping
    @CrossOrigin(origins = "*", maxAge = 3600)
    public ResponseEntity<List<Alquiler>> findAll(){
        List<Alquiler> list = new ArrayList<Alquiler>();
        alquilerRepository.findAll().forEach(e->list.add(e));
        return ResponseEntity.ok(list);
    }

    @PostMapping
    @CrossOrigin(origins = "*", maxAge = 3600) // create
    public ResponseEntity<Alquiler> create(@RequestBody Alquiler alquiler){
        return ResponseEntity.ok(alquilerRepository.save(alquiler));
    }

    @GetMapping("/{id}")
    @CrossOrigin(origins = "*", maxAge = 3600)
    public ResponseEntity<Alquiler> findById(@PathVariable Long id) {
        Optional<Alquiler> alquiler = alquilerRepository.findById(id);
        if (!alquiler.isPresent()) {
            ResponseEntity.badRequest().build();
        }
        return ResponseEntity.ok(alquiler.get());
    }

    @PutMapping
    @CrossOrigin(origins = "*", maxAge = 3600)
    public ResponseEntity<Alquiler> update(@RequestBody Alquiler alquiler) {
        if (!alquilerRepository.findById(alquiler.getId_Alquiler()).isPresent()) {
            ResponseEntity.badRequest().build();
        }
        return ResponseEntity.ok(alquilerRepository.save(alquiler));
    }

    @DeleteMapping("/{id}")
    @CrossOrigin(origins = "*", maxAge = 3600)
    public ResponseEntity delete(@PathVariable Long id) {
        if (!alquilerRepository.findById(id).isPresent()) {
            ResponseEntity.badRequest().build();
        }
        alquilerRepository.delete(alquilerRepository.findById(id).get());
        return ResponseEntity.ok().build();
    }

}
