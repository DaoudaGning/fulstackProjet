document.addEventListener('DOMContentLoaded', () => {
    const formulaire = document.getElementById('ajout-appartement-form');
    const appartementList = document.getElementById('appartement-list');
    formulaire.addEventListener('submit', async (e) => {
        e.preventDefault();
        const data = {
            adresse: document.getElementById('adresse').value,
            nombreDeChambres: document.getElementById('nombreDeChambres').value,
            nombreDeSallesDeBain: document.getElementById('nombreDeSallesDeBain').value,
            nombreDeSalons: document.getElementById('nombreDeSalons').value,
            cuisineEquipee: document.getElementById('cuisineEquipee').checked,
            autresCommodites: document.getElementById('autresCommodites').value,
        };

        try {
            const response = await fetch('http://localhost:8080/appartements', {
                method: 'POST',
                headers: {
                    'Content-Type': 'application/json',
                },
                body: JSON.stringify(data),
            });
            if (response.ok) {
                afficherAppartements();
            }
        } catch (error) {
            console.error('Erreur lors de l\'ajout:', error);
        }
    });
    afficherAppartements();
});
