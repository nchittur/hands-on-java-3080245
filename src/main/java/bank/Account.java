package bank;

public class Account {

  private int id;
  private String type;
  private float balance;

  public Account(int id, String type, float balance){
    setId(id);
    setType(type);
    setBalance(balance);
  }

  public int getId() {
    return id;
  }
  public void setId(int id) {
    this.id = id;
  }
  public String getType() {
    return type;
  }
  public void setType(String type) {
    this.type = type;
  }
  public float getBalance() {
    return balance;
  }
  public void setBalance(float balance) {
    this.balance = balance;
  } 
  
}
