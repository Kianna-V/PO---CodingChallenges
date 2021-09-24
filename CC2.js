function getHashTags(str) {
    let strArr = str
        .toLowerCase()
        .replace(/[^a-z ]/gi, "")
        .split(" ")
        .sort((a, b) => b.length - a.length)
        .map((word) => "#" + word);
    return strArr.splice(0, 3);
}