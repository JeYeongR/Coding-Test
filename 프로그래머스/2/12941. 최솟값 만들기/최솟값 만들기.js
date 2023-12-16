function solution(A,B){
    A.sort((a, b) => a - b);
    B.sort((a, b) => b - a);
    return A.reduce((total, val, idx) => total + val * B[idx], 0)
}