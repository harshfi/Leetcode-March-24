/**
 * @param {number[][]} moves
 * @return {string}
 */
var tictactoe = function(moves) {
    let arr= Array(9).fill("");
   const wins = [
  [0,1,2], // top row
  [3,4,5], // middle row
  [6,7,8], // bottom row
  [0,3,6], // left col
  [1,4,7], // middle col
  [2,5,8], // right col
  [0,4,8], // diagonal
  [2,4,6]  // other diagonal
              ];


    let chance="X";
    let cnt=0;
    for(let move of moves){
         arr[3*move[0]+move[1]]=cnt%2==0?"X":"O";

         if(check()){
            return  cnt%2===0?"A":"B";
         }
         cnt++;
    }
      return cnt==9?"Draw":"Pending"
     function check(){
      for(let [a,b,c] of wins){
        if(arr[a]!=='' && arr[a]===arr[b] && arr[b]==arr[c])return true
      }
      return false;
    }
    
};