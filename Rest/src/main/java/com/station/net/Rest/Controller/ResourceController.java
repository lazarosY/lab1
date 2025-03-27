package com.station.net.Rest.Controller;

import com.station.net.Rest.Repo.ResourceRepo;
import com.station.net.Rest.models.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/resources") 
public class ResourceController {
    @Autowired 
    private final ResourceRepo resourceRepository;
     
    public ResourceController(ResourceRepo resourceRepository) {
        this.resourceRepository = resourceRepository;
    }

   
    @GetMapping
    public List<Resource> getAllResources() {
        return resourceRepository.findAll();
    }

    
    @GetMapping("/{id}")
    public ResponseEntity<Resource> getResourceById(@PathVariable Long id) {
        Optional<Resource> resource = resourceRepository.findById(id);
        return resource.map(ResponseEntity::ok)
                .orElseGet(() -> ResponseEntity.notFound().build());
    }

    
    @PostMapping("/save")
    public Resource createResource(@RequestBody Resource resource) {
        return resourceRepository.save(resource);
    }

    
    @PutMapping("update/{id}")
    public ResponseEntity<Resource> updateResource(@PathVariable Long id, @RequestBody Resource updatedResource) {
        return resourceRepository.findById(id)
                .map(existingResource -> {
                    existingResource.setProductname(updatedResource.getProductname());
                    existingResource.setQuantity(updatedResource.getQuantity());
                    resourceRepository.save(existingResource);
                    return ResponseEntity.ok(existingResource);
                })
                .orElseGet(() -> ResponseEntity.notFound().build());
    }

    @DeleteMapping("delete/{id}")
    public ResponseEntity<Void> deleteResource(@PathVariable Long id) {
        if (resourceRepository.existsById(id)) {
            resourceRepository.deleteById(id);
            return ResponseEntity.noContent().build();
        } else {
            return ResponseEntity.notFound().build();
        }
    }
}