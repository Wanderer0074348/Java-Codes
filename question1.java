abstract class Member{
    String name;
    String address;
    abstract int getFee();
    abstract String getName();
    abstract String getAddress();

}

class StandardMember extends Member{
    StandardMember(String name, String address){
        this.name = name;
        this.address = address;
    }
    int getFee(){
        return 100;
    }
    String getName(){
        return this.name;
    }
    String getAddress(){
        return this.address;
    }
}

class SeniorMember extends Member{
    int fee;
    SeniorMember(String name, String address){
        this.name = name;
        this.address = address;
        this.fee = 50;
    }
    int getFee(){
        return 50;
    }
    String getName(){
        return this.name;
    }
    String getAddress(){
        return this.address;
    }
}

class Society{
    Member[] members;
    Society(Member[] members){
        this.members = members;
    }
    void printMembers(){
        for (int i = 0; i < members.length; i++) {
            System.out.println("Name: " + members[i].getName() + ", Address: " + members[i].getAddress() + ", Fee: " + members[i].getFee());
        }
    }
}

class question1 {
    public static void main(String[] args) {
        Member[] members = new Member[3];
        members[0] = new StandardMember("John", "123 Main St.");
        members[1] = new StandardMember("Jane", "456 Main St.");
        members[2] = new SeniorMember("James", "789 Main St.");
        Society society = new Society(members);
        society.printMembers();
    }
} 
