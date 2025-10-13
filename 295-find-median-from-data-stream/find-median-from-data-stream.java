class MedianFinder {
List<Integer> list= new ArrayList<>();
    public MedianFinder() {
        list= new ArrayList<>();
    }
    
    public void addNum(int num) {
       int idx= Collections.binarySearch(list,num);

       if(idx<0){
        idx=(-1*idx)-1;
         
       }

        list.add(idx,num);

    }
    
    public double findMedian() {
        if(list.size()%2==0 && list.size()!=0){
            int mid1=(list.size()-1)/2;
            int mid2=(list.size()/2);
            return (double)((double) list.get(mid1)+ (double)list.get(mid2))/2;
        }
        else return (double) list.get(list.size()/2);
    }
}

/**
 * Your MedianFinder object will be instantiated and called as such:
 * MedianFinder obj = new MedianFinder();
 * obj.addNum(num);
 * double param_2 = obj.findMedian();
 */