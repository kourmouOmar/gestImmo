/*
 * Be careful, do not modify this class, it is generated automatically.
 */
package com.softfactory.sigai.service.impl;
/**
 * Spring serviceImpl "Utilisateur"
 * 
 * @author : illass elbarhoumi
 * @creation : 08/11/20
 * @version : 1.0
 */

@Service
public class UtilisateurService implements IUtilisateurService {
	
	@Autowired
	UtilisateurRepository utilisateurRespository;
	
	@Override
	public UtilisateurEntity getUtilisateurById(Long idRole) {
		return utilisateurRespository.getUtilisateurBydId(idUtilisateur);
	}

	@Override
	public List<UtilisateurEntity> getAllUtilisateurs() {
		/* get all Utilisateur*/
		return utilisateurRespository.findAll();
	}

	@Override
	public UtilisateurEntity addUtilisateur(UtilisateurDto utilisateurDto) {
		/* add Utilisateur */
		return utilisateurRespository.save(UtilisateurDto.dtoToEntity(UtilisateurDto));
	}

	@Override
	public UtilisateurEntity updateUtilisateur(UtilisateurDto utilisateurDto) {
		/* update Utilisateur*/
		return utilisateurRespository.save(UtilisateurDto.dtoToEntity(UtilisateurDto));
	}

	@Override
	public void deleteUtilisateur(Long idUtilisateur) {
		/* delete Utilisateur*/
		utilisateurRespository.deleteById(idUtilisateur);
	}
}