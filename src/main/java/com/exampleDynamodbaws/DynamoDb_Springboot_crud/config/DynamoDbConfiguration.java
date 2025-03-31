package com.exampleDynamodbaws.DynamoDb_Springboot_crud.config;


import com.amazonaws.auth.AWSStaticCredentialsProvider;
import com.amazonaws.auth.BasicAWSCredentials;
import com.amazonaws.client.builder.AwsClientBuilder;
import com.amazonaws.services.dynamodbv2.AmazonDynamoDB;
import com.amazonaws.services.dynamodbv2.AmazonDynamoDBClientBuilder;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class DynamoDbConfiguration {

   @Bean
   public DynamoDBMapper dynamoDBMapper(){

       return new DynamoDBMapper(buildAmazonDynamoDB());
   }

    private AmazonDynamoDB buildAmazonDynamoDB() {
       return AmazonDynamoDBClientBuilder
               .standard()
               .withEndpointConfiguration(
                       new AwsClientBuilder.EndpointConfiguration(
                               "dynamodb.us-west-1.amazonaws.com",
                               "us-west-1"
                       )
               ).withCredentials(
                       new AWSStaticCredentialsProvider(
                               new BasicAWSCredentials(
                                       "AKIA2WZQ23X27XNEDHP5",
                                       "ic7NidNp2jVdt7dcrNJ9B/YMJS3a/2wD+tgCYuu8"
                               )
                       )
               ).build();
    }

}
