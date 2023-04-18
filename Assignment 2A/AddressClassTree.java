import java.util.TreeMap;

class Address {
    private String plotNo;
    private String at;
    private String post;

    public Address(String plotNo, String at, String post) {
        this.plotNo = plotNo;
        this.at = at;
        this.post = post;
    }

    public String getPlotNo() {
        return plotNo;
    }

    public void setPlotNo(String plotNo) {
        this.plotNo = plotNo;
    }

    public String getAt() {
        return at;
    }

    public void setAt(String at) {
        this.at = at;
    }

    public String getPost() {
        return post;
    }

    public void setPost(String post) {
        this.post = post;
    }
}

class TreeMapExample {
    public static void main(String[] args) {
        TreeMap<String, Address> addressMap = new TreeMap<>();
        
        // create some sample addresses
        Address address1 = new Address("1", "Main Street", "City1");
        Address address2 = new Address("2", "Park Avenue", "City2");
        Address address3 = new Address("3", "High Street", "City3");
        
        // insert the addresses into the map with person names as keys
        addressMap.put("John", address1);
        addressMap.put("Alice", address2);
        addressMap.put("Bob", address3);

        // display the contents of the map
        for (String name : addressMap.keySet()) {
            System.out.println("Name: " + name);
            Address address = addressMap.get(name);
            System.out.println("Address: " + address.getPlotNo() + ", " + address.getAt() + ", " + address.getPost());
        }
    }
}
