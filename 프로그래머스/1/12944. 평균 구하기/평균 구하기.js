function solution(arr) {
    const sum = arr.reduce((a,b) => a + b);
    
    return sum / arr.length;
}