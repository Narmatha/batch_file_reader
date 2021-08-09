package net.petrikainulainen.spring.batch;

import org.hibernate.cache.spi.support.AbstractReadWriteAccess;
import org.springframework.batch.core.Job;
import org.springframework.batch.core.Step;
import org.springframework.batch.core.configuration.annotation.JobBuilderFactory;
import org.springframework.batch.core.configuration.annotation.StepBuilderFactory;
import org.springframework.batch.core.launch.support.RunIdIncrementer;
import org.springframework.batch.item.ItemProcessor;
import org.springframework.batch.item.ItemReader;
import org.springframework.batch.item.ItemWriter;
import org.springframework.batch.item.file.FlatFileItemReader;
import org.springframework.batch.item.file.LineMapper;
import org.springframework.batch.item.file.builder.FlatFileItemReaderBuilder;
import org.springframework.batch.item.file.mapping.BeanWrapperFieldSetMapper;
import org.springframework.batch.item.file.mapping.DefaultLineMapper;
import org.springframework.batch.item.file.mapping.FieldSetMapper;
import org.springframework.batch.item.file.transform.DelimitedLineTokenizer;
import org.springframework.batch.item.file.transform.FixedLengthTokenizer;
import org.springframework.batch.item.file.transform.LineTokenizer;
import org.springframework.batch.item.file.transform.Range;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.ClassPathResource;

/**
 * This configuration class configures the Spring Batch job that
 * is used to demonstrate that our item reader reads the correct
 * information from the txt file.
 */
@Configuration
public class SpringBatchExampleJobConfig {


    @Bean
    public FlatFileItemReader fixLengthItemReader(){
        FlatFileItemReader reader = new FlatFileItemReader();
        reader.setResource(new ClassPathResource("data/TIF260001202107200015_324001_130001_TEST"));
        reader.setLineMapper(new DefaultLineMapper() {
            {
                setLineTokenizer(fixedLengthTokenizer());
                setFieldSetMapper(new BeanWrapperFieldSetMapper<TransactionDTO>() {
                    {
                        setTargetType(TransactionDTO.class);
                    }
                });
            }
        });
        return reader;
    }

    @Bean
    public FixedLengthTokenizer fixedLengthTokenizer() {
        FixedLengthTokenizer tokenizer = new FixedLengthTokenizer();
        tokenizer.setColumns(new Range[] { new Range(2, 3), new Range(4, 22), new Range(23, 28), new Range(34, 47) ,
                new Range(50, 55) ,new Range(56, 56) ,new Range(57, 60) ,new Range(61, 74) ,new Range(77, 82) ,new Range(83, 83) ,
                new Range(84, 87),new Range(34, 47) ,new Range(34, 47) ,new Range(34, 47) ,new Range(34, 47) ,new Range(34, 47),
                new Range(34, 47) ,new Range(34, 47) ,new Range(34, 47) ,new Range(34, 47) ,new Range(34, 47) ,new Range(34, 47) ,
                new Range(34, 47) ,new Range(34, 47),new Range(34, 47) ,new Range(34, 47) ,new Range(34, 47) ,new Range(34, 47),
                new Range(34, 47),new Range(34, 47) ,new Range(34, 47) ,new Range(34, 47) ,new Range(34, 47) ,new Range(34, 47)  });
        tokenizer.setNames(new String[] { "supplierProductCode", "obu_pan", "tspActorId", "transitEntryTime",
        "entryStationActorID","entryNetworkCode","entryTerminalCode","transitExitTime","exitStationActorID","exitNetworkCode",
        "exitTerminalCode","transactionLane","transactionTariff","vehicleClass","vehicleAxles","netAmount","vatAmount",
        "grossAmount","supplierCurrency","productCodeVATRate","levelOfSecurity","supplierTransaDescription","vehiclePlateNumber",
        "vehicleCountry","validationNATListId","vehicleFuelType","vehicleEuronorm","vehicleTariffClass","contextMark",
                "obe_pan","trxAggregateNbr","utcTimeStamp","supplierTransactionId","externalCostsNoise","externalCostsAir",
        "externalCostsNoiseOrAirDigits","emissionClass","enginCharacteristics","vehicleCO2","vehicleWeight"});
        tokenizer.setStrict(false);
        return tokenizer;
    }

    @Bean
    public ItemWriter<TransactionDTO> itemWriter() {
        return new LoggingItemWriter();
    }

    @Bean
    public ItemProcessor<TransactionDTO,TransactionDTO> itemProcessor() {
        return new LoggingItemProcessor();
    }

    /**
     * Creates a bean that represents the only step of our batch job.
     * @param reader
     * @param writer
     * @param stepBuilderFactory
     * @return
     */
    @Bean
    public Step exampleJobStep(ItemReader<TransactionDTO> reader,
                               ItemProcessor<TransactionDTO,TransactionDTO> processor,
                               ItemWriter<TransactionDTO> writer,
                               StepBuilderFactory stepBuilderFactory) {
        return stepBuilderFactory.get("exampleJobStep")
                .<TransactionDTO, TransactionDTO>chunk(100)
                .reader(reader)
                .processor(processor)
                .writer(writer)
                .build();
    }

    /**
     * Creates a bean that represents our example batch job.
     * @param exampleJobStep
     * @param jobBuilderFactory
     * @return
     */
    @Bean
    public Job exampleJob(Step exampleJobStep,
                          JobBuilderFactory jobBuilderFactory) {
        return jobBuilderFactory.get("exampleJob")
                .incrementer(new RunIdIncrementer())
                .flow(exampleJobStep)
                .end()
                .build();
    }
}
