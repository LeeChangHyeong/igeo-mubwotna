package com.sparta.igeomubwotna.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@Table(name = "recipe")
@NoArgsConstructor
public class Recipe extends Timestamped{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	// @ManyToOne(fetch = FetchType.LAZY)
	// @JoinColumn(name = "user_id", nullable = false)
	// private User user;
	@Column
	private String title;
	@Column
	private String content;

}
