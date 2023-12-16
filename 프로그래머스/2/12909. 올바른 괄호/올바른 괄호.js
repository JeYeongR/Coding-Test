function solution(s){
    let stackNum = 0;

    for(let e of s) {
        stackNum += e == "(" ? 1 : -1
        if(stackNum < 0) break
    }

    return stackNum == 0;
}