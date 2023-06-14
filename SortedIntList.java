public class SortedIntList extends IntListVer3{
    
    public SortedIntList(int initialcap){
        //call IntList constructor
        super(initialcap);
    }
    
    public SortedIntList(){
        super();
    }
    
    //override add
    public void add(int value){
        //search for location to insert value
        int pos = 0;
        while( pos < size() && value > get(pos) ){
            pos++;
        }
        super.insert(pos, value);
    }
    
}
