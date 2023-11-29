function solution(n, arr1, arr2) {
    let answer = [];
    for(let i = 0; i < n; i++) {
        answer.push((arr1[i] | arr2[i]).toString(2).padStart(n, 0).replaceAll("1", "#").replaceAll("0", " "));
    };
    return answer;
}