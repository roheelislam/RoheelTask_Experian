package assignment.records.service.impl;

import assignment.records.entity.DataRecords;
import assignment.records.repository.RecordRepository;
import assignment.records.service.RecordService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RecordServiceImpl implements RecordService {

    private final RecordRepository recordRepository;

    @Autowired
    public RecordServiceImpl(RecordRepository recordRepository) {
        this.recordRepository = recordRepository;
    }

    @Override
    public void saveFilm(DataRecords record) {
        this.recordRepository.save(record);
    }
}
