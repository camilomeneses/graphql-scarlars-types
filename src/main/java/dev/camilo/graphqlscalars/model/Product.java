package dev.camilo.graphqlscalars.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Entity
public class Product {
  @Id
  @GeneratedValue
  private Integer id;
  private String title;
  private Boolean isOnSale;
  private Float weight;
  private BigDecimal price;
  private LocalDateTime dateCreated;

  public Product() {
  }

  public Product(String title, Boolean isOnSale, Float weight, BigDecimal price, LocalDateTime dateCreated) {
    this.title = title;
    this.isOnSale = isOnSale;
    this.weight = weight;
    this.price = price;
    this.dateCreated = dateCreated;
  }

  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public Boolean getOnSale() {
    return isOnSale;
  }

  public void setOnSale(Boolean onSale) {
    isOnSale = onSale;
  }

  public Float getWeight() {
    return weight;
  }

  public void setWeight(Float weight) {
    this.weight = weight;
  }

  public BigDecimal getPrice() {
    return price;
  }

  public void setPrice(BigDecimal price) {
    this.price = price;
  }

  public LocalDateTime getDateCreated() {
    return dateCreated;
  }

  public void setDateCreated(LocalDateTime dateCreated) {
    this.dateCreated = dateCreated;
  }

  @Override
  public String toString() {
    final StringBuilder sb = new StringBuilder("Product{");
    sb.append("id=").append(id);
    sb.append(", title='").append(title).append('\'');
    sb.append(", isOnSale=").append(isOnSale);
    sb.append(", weight=").append(weight);
    sb.append(", price=").append(price);
    sb.append(", dateCreated=").append(dateCreated);
    sb.append('}');
    return sb.toString();
  }
}
