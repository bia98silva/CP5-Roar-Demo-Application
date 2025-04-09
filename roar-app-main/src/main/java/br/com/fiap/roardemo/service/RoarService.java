package br.com.fiap.roardemo.service;

import br.com.fiap.roardemo.model.Roar;
import br.com.fiap.roardemo.repository.RoarRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RoarService {

    private final RoarRepository roarRepository;

    public RoarService(RoarRepository roarRepository) {
        this.roarRepository = roarRepository;
    }

    public List<Roar> getRoars() {
        return roarRepository.findAll();
    }

    public void addRoar(String content, String username) {
        Roar roar = new Roar(content, username);
        roarRepository.save(roar);
    }

    public void likeRoar(Long roarId) {
        roarRepository.findById(roarId).ifPresent(roar -> {
            roar.setLikes(roar.getLikes() + 1);
            roarRepository.save(roar);
        });
    }
}
