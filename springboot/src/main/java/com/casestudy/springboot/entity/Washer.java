package com.casestudy.springboot.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.validator.constraints.Length;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

@Entity
@Data
//@NoArgsConstructor
//@AllArgsConstructor
@Builder
public class Washer {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long washerId;

    @NotBlank(message = "Please add washer Name")
    @Length(max = 8, min = 3)
    private String washerName;

    @Email(message = "Email is not valid")
    private String washerEmail;

    @Size(max = 10, min = 0, message = "Must enter 10 numbers")
    private String mobNo;

    public Long getWasherId() {
        return washerId;
    }

    public void setWasherId(Long washerId) {
        this.washerId = washerId;
    }

    public String getWasherName() {
        return washerName;
    }

    public void setWasherName(String washerName) {
        this.washerName = washerName;
    }

    public String getWasherEmail() {
        return washerEmail;
    }

    public void setWasherEmail(String washerEmail) {
        this.washerEmail = washerEmail;
    }

    public String getMobNo() {
        return mobNo;
    }

    public void setMobNo(String mobNo) {
        this.mobNo = mobNo;
    }

    public Washer(Long washerId, String washerName, String washerEmail, String mobNo) {
        this.washerId = washerId;
        this.washerName = washerName;
        this.washerEmail = washerEmail;
        this.mobNo = mobNo;
    }

    public Washer() {
    }

    @Override
    public String toString() {
        return "Washer{" +
                "washerId=" + washerId +
                ", washerName='" + washerName + '\'' +
                ", washerEmail='" + washerEmail + '\'' +
                ", mobNo='" + mobNo + '\'' +
                '}';
    }
}
