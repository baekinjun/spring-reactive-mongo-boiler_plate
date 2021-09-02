package com.api.reactivemongo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

//jpa table 만드는것과 비슷
@Document(collection = "persons")
@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Person {
    //rdbma 는 long 으로 id 처리
    //mongo 는 string 값으로 nosql 이라 object id 이다. 랜덤으로 발생하는 값
    @Id
    private String id;
    private String name;
    private String email;
}
