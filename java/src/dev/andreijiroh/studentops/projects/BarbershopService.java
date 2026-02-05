package dev.andreijiroh.studentops.projects;

/**
 * Computer Programming 2 - 01 Laboratory Exercise
 * 
 * Library code needed for the lab output
 * 
 * @author Andrei Jiroh Eugenio Halili (STI College Meycauayan) <halili.459491@meycauayan.sti.edu.ph>
 */
public class BarbershopService {
  private String serviceDescription;
  private double price;

  public void setServiceDescription(String service) { 
    serviceDescription = service; 
  } 
  public void setPrice(double servicePrice) { 
    price = servicePrice; 
  }

  public String getServiceDescription() { 
    return serviceDescription; 
  } 
  public double getPrice() { 
    return price; 
  } 
}