package com.stonemap.app.service;
import com.stonemap.app.repository.StoneRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


@Service
@Transactional
public class StoneService {

    private final StoneRepository stoneRepository;

    public StoneService(StoneRepository stoneRepository) {
        this.stoneRepository = stoneRepository;
    }

//    @Transactional(readOnly = true)
//    public Page<Stone> getAllManagedUsers(Pageable pageable) {
//        return stoneRepository.findAllBy(pageable).map(Stone::new);
//    }
}
