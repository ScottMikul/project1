public class Jar{
  private String itemName;
  private int maxItems;
  private int count;
  public Jar(String itemName, int maxItems){
    this.itemName = itemName;
    this.maxItems = maxItems;
  }
  public void fill(){
     count = (int)(Math.random()*(maxItems))+1;
  }
  public int getCount(){
    return count; 
  }
  public int getMaxItems(){
    return maxItems;
  }
  public String getItem(){
    return itemName;
  }
  
}