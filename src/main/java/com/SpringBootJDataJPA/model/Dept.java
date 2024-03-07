package com.SpringBootJDataJPA.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "depttab")
public class Dept {
	@Id
	@Column(name = "did")
	private Integer deptId;
	@Column(name = "dcode")
	private String deptCode;
	@Column(name = "dadmin")
	private String deptAdmin;
}
