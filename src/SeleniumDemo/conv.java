package SeleniumDemo;


import java.util.*; 

class conv { 
  public static void main(String[] args) { 
  
    // Creating a hash set of strings 
    Set<String> s = new HashSet<String>(); 
    s.add("aniru"); 
    s.add("anir"); 
  
    //int n = s.size(); 
    List<String> aList = new ArrayList<String>(s); 
    for (String x : s) 
      aList.add(x); 
  
    System.out.println("Created ArrayList is"); 
   for (String x : aList) 
    System.out.println(x); 

    
  } 
} 