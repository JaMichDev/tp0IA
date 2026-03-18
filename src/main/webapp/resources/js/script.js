/**
 * Script JavaScript pour l'application de chat
 */

/**
 * Copie le contenu d'une textarea vers le presse-papiers
 * @param elementId L'ID de l'élément textarea
 */
function copyToClipboard(elementId) {
    const textarea = document.getElementById(elementId);
    if (!textarea || textarea.value.trim() === '') {
        alert('Rien à copier !');
        return;
    }

    try {
        // Sélectionner le texte
        textarea.select();
        textarea.setSelectionRange(0, 99999); // Pour les mobiles

        // Copier vers le presse-papiers
        document.execCommand('copy');
        
        // Feedback visuel
        alert('Copié dans le presse-papiers !');
    } catch (err) {
        console.error('Erreur lors de la copie:', err);
        alert('Erreur lors de la copie');
    }
}

/**
 * Initialise les événements de la page
 */
document.addEventListener('DOMContentLoaded', function() {
    // Ajouter des raccourcis clavier
    document.addEventListener('keydown', function(event) {
        // Ctrl+Enter pour envoyer
        if (event.ctrlKey && event.key === 'Enter') {
            const sendBtn = document.querySelector('button[value="Envoyer"]');
            if (sendBtn) {
                sendBtn.click();
            }
        }
    });
});
