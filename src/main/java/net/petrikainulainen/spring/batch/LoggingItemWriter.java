package net.petrikainulainen.spring.batch;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.batch.item.ItemWriter;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * This {@code ItemWriter} writes the received {@link TransactionDTO} objects
 * to a log file. The goal of this component is to help us to demonstrate
 * that our item reader reads the correct information from the txt file.
 */
public class LoggingItemWriter implements ItemWriter<TransactionDTO> {

    @Autowired
    TransactionRepo transactionRepo;

    private static final Logger LOGGER = LoggerFactory.getLogger(LoggingItemWriter.class);

    @Override
    public void write(List<? extends TransactionDTO> list) throws Exception {
        transactionRepo.save(list.get(0));
        LOGGER.info("Writing Transaction: {}", list);
    }
}
