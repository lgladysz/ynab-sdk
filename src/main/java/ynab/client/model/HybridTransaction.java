/*
 * YNAB API Endpoints
 * Our API uses a REST based design, leverages the JSON data format, and relies upon HTTPS for transport. We respond with meaningful HTTP response codes and if an error occurs, we include error details in the response body.  API Documentation is at https://api.youneedabudget.com
 *
 * OpenAPI spec version: 1.0.0
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package ynab.client.model;

import java.util.Objects;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.math.BigDecimal;
import org.threeten.bp.LocalDate;
import ynab.client.model.TransactionSummary;

/**
 * HybridTransaction
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-06-25T01:42:20.552-05:00")
public class HybridTransaction {
  @SerializedName("id")
  private String id = null;

  @SerializedName("date")
  private LocalDate date = null;

  @SerializedName("amount")
  private BigDecimal amount = null;

  /**
   * The cleared status of the transaction
   */
  @JsonAdapter(ClearedEnum.Adapter.class)
  public enum ClearedEnum {
    CLEARED("cleared"),
    
    UNCLEARED("uncleared"),
    
    RECONCILED("reconciled");

    private String value;

    ClearedEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static ClearedEnum fromValue(String text) {
      for (ClearedEnum b : ClearedEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<ClearedEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final ClearedEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public ClearedEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return ClearedEnum.fromValue(String.valueOf(value));
      }
    }
  }

  @SerializedName("cleared")
  private ClearedEnum cleared = null;

  @SerializedName("approved")
  private Boolean approved = null;

  @SerializedName("account_id")
  private String accountId = null;

  @SerializedName("deleted")
  private Boolean deleted = null;

  /**
   * Whether the hybrid transaction represents a regular transaction or a subtransaction
   */
  @JsonAdapter(TypeEnum.Adapter.class)
  public enum TypeEnum {
    TRANSACTION("transaction"),
    
    SUBTRANSACTION("subtransaction");

    private String value;

    TypeEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static TypeEnum fromValue(String text) {
      for (TypeEnum b : TypeEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<TypeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final TypeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public TypeEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return TypeEnum.fromValue(String.valueOf(value));
      }
    }
  }

  @SerializedName("type")
  private TypeEnum type = null;

  @SerializedName("account_name")
  private String accountName = null;

  public HybridTransaction id(String id) {
    this.id = id;
    return this;
  }

   /**
   * Get id
   * @return id
  **/
  @ApiModelProperty(required = true, value = "")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public HybridTransaction date(LocalDate date) {
    this.date = date;
    return this;
  }

   /**
   * Get date
   * @return date
  **/
  @ApiModelProperty(required = true, value = "")
  public LocalDate getDate() {
    return date;
  }

  public void setDate(LocalDate date) {
    this.date = date;
  }

  public HybridTransaction amount(BigDecimal amount) {
    this.amount = amount;
    return this;
  }

   /**
   * The transaction amount in milliunits format
   * @return amount
  **/
  @ApiModelProperty(required = true, value = "The transaction amount in milliunits format")
  public BigDecimal getAmount() {
    return amount;
  }

  public void setAmount(BigDecimal amount) {
    this.amount = amount;
  }

  public HybridTransaction cleared(ClearedEnum cleared) {
    this.cleared = cleared;
    return this;
  }

   /**
   * The cleared status of the transaction
   * @return cleared
  **/
  @ApiModelProperty(required = true, value = "The cleared status of the transaction")
  public ClearedEnum getCleared() {
    return cleared;
  }

  public void setCleared(ClearedEnum cleared) {
    this.cleared = cleared;
  }

  public HybridTransaction approved(Boolean approved) {
    this.approved = approved;
    return this;
  }

   /**
   * Whether or not the transaction is approved
   * @return approved
  **/
  @ApiModelProperty(required = true, value = "Whether or not the transaction is approved")
  public Boolean isApproved() {
    return approved;
  }

  public void setApproved(Boolean approved) {
    this.approved = approved;
  }

  public HybridTransaction accountId(String accountId) {
    this.accountId = accountId;
    return this;
  }

   /**
   * Get accountId
   * @return accountId
  **/
  @ApiModelProperty(required = true, value = "")
  public String getAccountId() {
    return accountId;
  }

  public void setAccountId(String accountId) {
    this.accountId = accountId;
  }

  public HybridTransaction deleted(Boolean deleted) {
    this.deleted = deleted;
    return this;
  }

   /**
   * Whether or not the transaction has been deleted.  Deleted transactions will only be included in delta requests.
   * @return deleted
  **/
  @ApiModelProperty(required = true, value = "Whether or not the transaction has been deleted.  Deleted transactions will only be included in delta requests.")
  public Boolean isDeleted() {
    return deleted;
  }

  public void setDeleted(Boolean deleted) {
    this.deleted = deleted;
  }

  public HybridTransaction type(TypeEnum type) {
    this.type = type;
    return this;
  }

   /**
   * Whether the hybrid transaction represents a regular transaction or a subtransaction
   * @return type
  **/
  @ApiModelProperty(required = true, value = "Whether the hybrid transaction represents a regular transaction or a subtransaction")
  public TypeEnum getType() {
    return type;
  }

  public void setType(TypeEnum type) {
    this.type = type;
  }

  public HybridTransaction accountName(String accountName) {
    this.accountName = accountName;
    return this;
  }

   /**
   * Get accountName
   * @return accountName
  **/
  @ApiModelProperty(required = true, value = "")
  public String getAccountName() {
    return accountName;
  }

  public void setAccountName(String accountName) {
    this.accountName = accountName;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    HybridTransaction hybridTransaction = (HybridTransaction) o;
    return Objects.equals(this.id, hybridTransaction.id) &&
        Objects.equals(this.date, hybridTransaction.date) &&
        Objects.equals(this.amount, hybridTransaction.amount) &&
        Objects.equals(this.cleared, hybridTransaction.cleared) &&
        Objects.equals(this.approved, hybridTransaction.approved) &&
        Objects.equals(this.accountId, hybridTransaction.accountId) &&
        Objects.equals(this.deleted, hybridTransaction.deleted) &&
        Objects.equals(this.type, hybridTransaction.type) &&
        Objects.equals(this.accountName, hybridTransaction.accountName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, date, amount, cleared, approved, accountId, deleted, type, accountName);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class HybridTransaction {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    date: ").append(toIndentedString(date)).append("\n");
    sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
    sb.append("    cleared: ").append(toIndentedString(cleared)).append("\n");
    sb.append("    approved: ").append(toIndentedString(approved)).append("\n");
    sb.append("    accountId: ").append(toIndentedString(accountId)).append("\n");
    sb.append("    deleted: ").append(toIndentedString(deleted)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    accountName: ").append(toIndentedString(accountName)).append("\n");
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

