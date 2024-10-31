document.addEventListener('DOMContentLoaded', () => {
    const container = document.getElementById('fireworks-container');

    function createFirework() {
        const firework = document.createElement('div');
        firework.className = 'firework';
        firework.style.left = `${Math.random() * 100}vw`;
        firework.style.top = `${Math.random() * 100}vh`;
        
        const size = Math.random() * 10 + 10;
        firework.style.width = `${size}px`;
        firework.style.height = `${size}px`;

        const colors = ['#ff0043', '#14fc56', '#1e7fff', '#e60aff', '#ffbf36', '#ffffff'];
        firework.style.backgroundColor = colors[Math.floor(Math.random() * colors.length)];

        container.appendChild(firework);

        setTimeout(() => {
            firework.remove();
        }, 2000);
    }

    function launchFireworks() {
        createFirework();
        setTimeout(launchFireworks, Math.random() * 1000 + 500);
    }

    launchFireworks();
});
