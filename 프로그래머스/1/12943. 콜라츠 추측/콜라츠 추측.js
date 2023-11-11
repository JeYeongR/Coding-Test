function solution(num) {
    var answer = 0;
    
    let count = 0;
    while(num !== 1 && count !== 500) {
        if(num % 2 == 0) {
            num /= 2;
        } else {
            num *= 3;
            num++;
        }
        count++;
    }
    
    return num === 1 ? count : -1;
}