package assignment.records.repository;

import assignment.records.entity.DataRecords;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RecordRepository extends JpaRepository<DataRecords, Long> {
}
