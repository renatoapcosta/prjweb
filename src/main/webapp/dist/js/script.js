document.addEventListener('DOMContentLoaded', function () {
    const colorToggleBtn = document.getElementById('colorToggle');
    const contentElement = document.getElementById('content');

    colorToggleBtn.addEventListener('click', function () {
        contentElement.classList.toggle('light-blue-bg');
        contentElement.classList.toggle('dark-orange-text');
        contentElement.classList.toggle('light-red-bg');
        contentElement.classList.toggle('dark-green-text');
    });
});
