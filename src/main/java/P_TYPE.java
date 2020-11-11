
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;



/**
 *
 * @author niyi
 */
public class P_TYPE {
    private int id;
    private String name;
    private String description;
    
    
    //  refactoring to create the setter and getter for the properties

    /**
     * @return the id
     */
    public int getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String NAME) {
        this.name = NAME;
    }

    /**
     * @return the description
     */
    public String getDescription() {
        return description;
    }

    /**
     * @param description the description to set
     */
    public void setDescription(String DESCRIPTION) {
        this.description = DESCRIPTION;
    }
    
    // I created the class constructors
    public P_TYPE(){}
    
    public P_TYPE(Integer ID, String NAME, String DESCRIPTION)
    {
        this.id = ID;
        this.name = NAME;
        this.description = DESCRIPTION;
        
    }
    
    // I created functions to insert - edit - remove type using PreparedStatement query for the database
    public boolean execTypeQuery(String queryType, P_TYPE type)
    {
        PreparedStatement ps;
        
        // add a new type 
        if(queryType.equals("add"))
        {
            try {
                // query -> INSERT INTO `property_type`(`name`, `description`) VALUES (?,?)
                ps = THE_CONNECTION.getTheConnection().prepareStatement("INSERT INTO `property_type`(`name`, `description`) VALUES (?,?)");
                ps.setString(1, type.getName());
                ps.setString(2, type.getDescription());
                
                 return (ps.executeUpdate() > 0);
                    
                    
                
            } catch (SQLException ex) {
                Logger.getLogger(P_TYPE.class.getName()).log(Level.SEVERE, null, ex);
                return false;
            }
                
        }
      
          // edit 
       else if(queryType.equals("edit"))
        {
            try {
                // query -> UPDATE `property_type` SET `name`=?,`description`= ? WHERE `id`=?
                ps = THE_CONNECTION.getTheConnection().prepareStatement("UPDATE `property_type` SET `name`=?,`description`= ? WHERE `id`=?");
                ps.setString(1, type.getName());
                ps.setString(2, type.getDescription());
                ps.setInt(3, type.getId());
                
                 return (ps.executeUpdate() > 0);
                    
                    
                
            } catch (SQLException ex) {
                Logger.getLogger(P_TYPE.class.getName()).log(Level.SEVERE, null, ex);
                return false;
            }
                
        }
        
           // remove 
       else if(queryType.equals("remove"))
        {
            try {
                // query -> DELETE FROM `property_type` WHERE `id` = ?
                ps = THE_CONNECTION.getTheConnection().prepareStatement("DELETE FROM `property_type` WHERE `id` = ?");
                
                ps.setInt(1 , type.getId());
                
                 return (ps.executeUpdate() > 0);
                    
                    
                
            } catch (SQLException ex) {
                Logger.getLogger(P_TYPE.class.getName()).log(Level.SEVERE, null, ex);
                return false;
            }
                
        }
       else{
           JOptionPane.showMessageDialog(null, "Select the correct Operation(add, edit, remove)", "Invalid operation", 2);
           return false;
       }
    }
    
    
}
