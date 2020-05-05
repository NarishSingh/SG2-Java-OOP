/*
practice with data (un)marshalling
 */
package RPGInventoryCodeAlong;

public class ItemMapper {

    private static final String DELIMITER = "::"; //to standardize our delimiter

    public static String marshallItem(Item item) {
        String itemString = "";
        
        //cast as String to standardize the filestream output
        itemString += item.id.toString() + DELIMITER;
        itemString += Double.toString(item.getCost()) + DELIMITER; //must cast the numbers to String
        itemString += Double.toString(item.getWeight()); //no delimiter b/c endline
        
        return itemString;
    }

    public static Item unmarshallItem(String itemString){
        String[] data=itemString.split(DELIMITER);
        
        if (data.length>3) {
            System.out.println("Something went wrong...");
        }
        
        //parse it back from String to int/double
        Item item=new Item(Double.parseDouble(data[1]), Double.parseDouble(data[2]));
        item.setId(Integer.parseInt(data[0]));
        
        return item;
    }
}
