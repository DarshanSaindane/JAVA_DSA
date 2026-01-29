public class arrayImplementationOfQueue{
    public static class que{
        int f =-1;
        int r =-1;
        int size = 0;
        int[] arr = new int[5];

        public void add(int val){
            if(r==arr.length-1){
                System.out.println("Queue os Full");
                return;
            }
            if(f==-1 && r==-1){
                f = r = 0;
                arr[r] = val;
            }
            else{
                arr[++r] = val; //here we first increment the r and then add the value at aar[r];
            }
            size++;

        }
        
        public int remove(){
            //check underflow condition
            if(size == 0){
                System.out.println("Queue is Empty.");
                return -1;
            }
            int val = arr[f++]; //here we first put the value of f in val and then increment it
            size--;
            return val;
        }

        public int peek(){
            if(size == 0){
                System.out.println("Queue is empty");
                return -1;
            }
            return arr[f];
        }

        public boolean isEmpty(){
            if(size==0){
                return true;
            }
            else{
                return false;
            }
        }

        public void display(){
            if(size==0){
                System.out.println("Queue is empty");
            }
            else{
                for(int i=f;i<=r;i++){
                    System.out.print(arr[i] + ",");
                }
            }
            System.out.println();
        }
    }
    public static void main(String[] args){
        que q = new que();
        q.add(1);
        q.add(2);
        q.add(5);
        q.display();
        q.remove();
        q.display();
        System.out.println(q.peek());
    }
}