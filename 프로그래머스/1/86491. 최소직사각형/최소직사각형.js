function solution(sizes) {
    let width = 0;
    let length = 0;
    sizes.forEach(s => {
        const [a, b] = s.sort((a, b) => a - b);
        width = Math.max(a, width);
        length = Math.max(b, length);
    });
    return width * length;
}