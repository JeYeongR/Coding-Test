function solution(name, yearning, photo) {
    return photo.map(e => e.reduce((a, c) => a + (yearning[name.indexOf(c)] ?? 0), 0));
}