package qsh.laputa.entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@JsonIgnoreProperties(value = { "hibernateLazyInitializer", "handler" })//实体类中有的字段值为null，所以在json化的时候，fasterxml.jackson将对象转换为json报错
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Department {
    private Integer id;
    private String name;
    private String intro;
    private List<Employee> emps;
}
