function solution(numbers) {
    return 45 - numbers.reduce((total, a) => total + a, 0);
}