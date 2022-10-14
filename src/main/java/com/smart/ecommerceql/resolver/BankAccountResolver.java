//package com.smart.ecommerceql.resolver;
//
//
//import com.smart.ecommerceql.model.BankAccount;
//import com.smart.ecommerceql.model.Currency;
//import graphql.kickstart.tools.GraphQLQueryResolver;
//import lombok.extern.slf4j.Slf4j;
//import org.springframework.stereotype.Component;
//
//import java.util.List;
//import java.util.UUID;
//
//@Component
//@Slf4j
//public class BankAccountResolver implements GraphQLQueryResolver {
//
//    public BankAccount bankAccount(UUID id){
//        log.info("Retrieving bank account id {}", id);
//        return BankAccount.builder()
//                .id(id)
//                .currency(Currency.USD)
//                .name("Habib").build();
//
//    }
//
//    public List<BankAccount> allAccounts(){
//        log.info("Retrieving all bank accounts {}");
//        return List.of(
//                BankAccount.builder()
//                    .id(UUID.fromString("c31ef1b1-d109-4638-b66e-539463a05fa8"))
//                    .currency(Currency.USD)
//                    .name("Habib").build(),
//
//                BankAccount.builder()
//                        .id(UUID.fromString("1a35aef2-9204-4d3d-899f-79ee16ed1cf4"))
//                        .currency(Currency.NGN)
//                        .name("James").build(),
//
//                BankAccount.builder()
//                        .id(UUID.fromString("a292e1ed-c755-4a2a-9685-9bae04db9e2b"))
//                        .currency(Currency.NGN)
//                        .name("Abidemi").build(),
//
//                BankAccount.builder()
//                        .id(UUID.fromString("a5ac6e69-2c65-4825-9d9a-5eb746f7ad00"))
//                        .currency(Currency.USD)
//                        .name("Solape").build()
//
//        );
//
//    }
//}
