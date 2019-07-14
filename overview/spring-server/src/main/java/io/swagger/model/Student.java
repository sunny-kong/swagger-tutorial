package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Student
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2019-07-14T14:59:12.053Z")

public class Student   {
  @JsonProperty("id")
  private Integer id = null;

  @JsonProperty("name")
  private String name = null;

  @JsonProperty("age")
  private Integer age = null;

  /**
   * 性别
   */
  public enum GenderEnum {
    MALE("male"),
    
    FEMALE("female");

    private String value;

    GenderEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static GenderEnum fromValue(String text) {
      for (GenderEnum b : GenderEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
  }

  @JsonProperty("gender")
  private GenderEnum gender = null;

  public Student id(Integer id) {
    this.id = id;
    return this;
  }

  /**
   * 学生ID，主键
   * @return id
  **/
  @ApiModelProperty(example = "10", value = "学生ID，主键")


  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public Student name(String name) {
    this.name = name;
    return this;
  }

  /**
   * 学生姓名,最长不能超过20位
   * @return name
  **/
  @ApiModelProperty(example = "张三", value = "学生姓名,最长不能超过20位")

@Size(max=20) 
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Student age(Integer age) {
    this.age = age;
    return this;
  }

  /**
   * 学生年龄，0-99岁之间
   * minimum: 0
   * maximum: 99
   * @return age
  **/
  @ApiModelProperty(example = "20", value = "学生年龄，0-99岁之间")

@Min(0) @Max(99) 
  public Integer getAge() {
    return age;
  }

  public void setAge(Integer age) {
    this.age = age;
  }

  public Student gender(GenderEnum gender) {
    this.gender = gender;
    return this;
  }

  /**
   * 性别
   * @return gender
  **/
  @ApiModelProperty(example = "male", value = "性别")


  public GenderEnum getGender() {
    return gender;
  }

  public void setGender(GenderEnum gender) {
    this.gender = gender;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Student student = (Student) o;
    return Objects.equals(this.id, student.id) &&
        Objects.equals(this.name, student.name) &&
        Objects.equals(this.age, student.age) &&
        Objects.equals(this.gender, student.gender);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, age, gender);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Student {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    age: ").append(toIndentedString(age)).append("\n");
    sb.append("    gender: ").append(toIndentedString(gender)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

