class MyCircularDeque {
    private int data[];
    private int start=0;
    private int end=0;
    public MyCircularDeque(int k) {
        data=new int[k];
    }
    
    public boolean insertFront(int value){
        if(isFull())
        return false;
        else
        {
            if(start>0)
            {
                start--;
                data[index(start)]=value;
                return true;
            }
            else{
                for(int i=end;i!=start;i--) 
                {
                    data[index(i)]=data[index(i-1)];
                }
                data[index(start)]=value;
                end++;
                return true;
            }
        }
    }
    
    public boolean insertLast(int value) {
        if(isFull())
        return false;

        data[index(end++)]=value;
        return true;

    }
    
    public boolean deleteFront() {
        if(isEmpty())
        return false;

        start++;
        return true;
        
    }
    
    public boolean deleteLast() {
        if(isEmpty())
        return false;
        end--;
        return true;
    }
    
    public int getFront() {
        return isEmpty()?-1: data[index(start)];
    }
    
    public int getRear() {
        return isEmpty()?-1: data[index(end-1)];
    }
    
    public boolean isEmpty() {
        return start==end;
    }
    
    public boolean isFull() {
        return end-start==data.length;
    }
    private int index(int ptr)
    {
        return ptr%data.length;
    }
}
