/**
 * @param {Array} arr
 * @param {number} size
 * @return {Array}
 */
var chunk = function(arr, size) {
    let n=arr.length;
    let nn=n/size;
    let ans=[];
    for(let i=0;i<n;){
        let num=[];
        let k=0;
        while(i<n && k++<size){
            num.push(arr[i]);
            i++;
        }
        ans.push(num);
    }
    return ans;
};
