package net.petrikainulainen.spring.batch;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.batch.item.ItemProcessor;
import org.springframework.batch.item.ItemWriter;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * This {@code ItemWriter} writes the received {@link TransactionDTO} objects
 * to a log file. The goal of this component is to help us to demonstrate
 * that our item reader reads the correct information from the txt file.
 */
public class LoggingItemProcessor implements ItemProcessor<TransactionDTO,TransactionDTO> {

    @Override
    public TransactionDTO process(TransactionDTO transactionDTO) throws Exception {
       // if (!transactionDTO.getTransactionLane().isBlank() && !transactionDTO.getEnginCharacteristics().isBlank()){
        if (transactionDTO.getTransactionLane().isBlank()){
       // if ((transactionDTO.getTransactionLane() ==null || transactionDTO.getTransactionLane().isBlank() ) || (transactionDTO.getEnginCharacteristics() ==null || transactionDTO.getEnginCharacteristics().isBlank() )){
            System.out.println("Missing Transaction Lane &  enginCharacteristics: " + transactionDTO.getTransactionLane());
            return null;
        }

        System.out.println("============================================================ ");
        return transactionDTO;
    }
}
