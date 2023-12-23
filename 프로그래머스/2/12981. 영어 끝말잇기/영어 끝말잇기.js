function solution(n, words) {
    let failIdx = 0;
    for(let i = 1; i < words.length; i++){
        let val = words[i];
        let prevVal = words[i-1];
        if(prevVal.substring(prevVal.length - 1) !== val.substring(0, 1)) {
            failIdx = i;
            break;
        } 
        if(words.indexOf(val) !== i) {
            failIdx = i;
            break;
        }
    }

    if(failIdx == 0) return [0,0];

    let people = failIdx % n + 1;
    let turn = Math.floor(failIdx / n) + 1; 

    return [people, turn];
}