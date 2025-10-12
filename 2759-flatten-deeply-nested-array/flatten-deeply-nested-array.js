/**
 * @param {Array} arr
 * @param {number} depth
 * @return {Array}
 */
 
var flat = function (arr, n) {
    if(n===0)return arr;
    let ans=[]
    for(let i of arr){
        if(typeof(i)==='object'){
           const v= flat(i,n-1);
            ans.push(...v);
        }
        else ans.push(i);

    }
    return ans;
};