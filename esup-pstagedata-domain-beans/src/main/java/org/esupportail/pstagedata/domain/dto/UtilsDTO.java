package org.esupportail.pstagedata.domain.dto;

import java.util.ArrayList;
import java.util.List;

import org.esupportail.pstagedata.domain.beans.AccordPartenariat;
import org.esupportail.pstagedata.domain.beans.AdminStructure;
import org.esupportail.pstagedata.domain.beans.Affectation;
import org.esupportail.pstagedata.domain.beans.Assurance;
import org.esupportail.pstagedata.domain.beans.Avenant;
import org.esupportail.pstagedata.domain.beans.CaisseRegime;
import org.esupportail.pstagedata.domain.beans.CentreGestion;
import org.esupportail.pstagedata.domain.beans.CentreGestionSuperviseur;
import org.esupportail.pstagedata.domain.beans.Civilite;
import org.esupportail.pstagedata.domain.beans.Confidentialite;
import org.esupportail.pstagedata.domain.beans.Contact;
import org.esupportail.pstagedata.domain.beans.ContratOffre;
import org.esupportail.pstagedata.domain.beans.Convention;
import org.esupportail.pstagedata.domain.beans.CritereGestion;
import org.esupportail.pstagedata.domain.beans.CritereRechercheConvention;
import org.esupportail.pstagedata.domain.beans.CritereRechercheOffre;
import org.esupportail.pstagedata.domain.beans.CritereRechercheStructureAdresse;
import org.esupportail.pstagedata.domain.beans.CritereRechercheStructureAncien;
import org.esupportail.pstagedata.domain.beans.DroitAdministration;
import org.esupportail.pstagedata.domain.beans.DureeDiffusion;
import org.esupportail.pstagedata.domain.beans.Effectif;
import org.esupportail.pstagedata.domain.beans.Enseignant;
import org.esupportail.pstagedata.domain.beans.Etape;
import org.esupportail.pstagedata.domain.beans.Etudiant;
import org.esupportail.pstagedata.domain.beans.FapN1;
import org.esupportail.pstagedata.domain.beans.FapN2;
import org.esupportail.pstagedata.domain.beans.FapN3;
import org.esupportail.pstagedata.domain.beans.FapQualification;
import org.esupportail.pstagedata.domain.beans.FapQualificationSimplifiee;
import org.esupportail.pstagedata.domain.beans.Fichier;
import org.esupportail.pstagedata.domain.beans.Indemnisation;
import org.esupportail.pstagedata.domain.beans.LangueConvention;
import org.esupportail.pstagedata.domain.beans.ModeCandidature;
import org.esupportail.pstagedata.domain.beans.ModeValidationStage;
import org.esupportail.pstagedata.domain.beans.ModeVersGratification;
import org.esupportail.pstagedata.domain.beans.NafN1;
import org.esupportail.pstagedata.domain.beans.NafN5;
import org.esupportail.pstagedata.domain.beans.NatureTravail;
import org.esupportail.pstagedata.domain.beans.NiveauCentre;
import org.esupportail.pstagedata.domain.beans.NiveauFormation;
import org.esupportail.pstagedata.domain.beans.Offre;
import org.esupportail.pstagedata.domain.beans.OffreDiffusion;
import org.esupportail.pstagedata.domain.beans.OrigineStage;
import org.esupportail.pstagedata.domain.beans.Pays;
import org.esupportail.pstagedata.domain.beans.PersonnelCentreGestion;
import org.esupportail.pstagedata.domain.beans.Service;
import org.esupportail.pstagedata.domain.beans.StatutJuridique;
import org.esupportail.pstagedata.domain.beans.Structure;
import org.esupportail.pstagedata.domain.beans.TempsTravail;
import org.esupportail.pstagedata.domain.beans.Theme;
import org.esupportail.pstagedata.domain.beans.TicketStructure;
import org.esupportail.pstagedata.domain.beans.TypeConvention;
import org.esupportail.pstagedata.domain.beans.TypeOffre;
import org.esupportail.pstagedata.domain.beans.TypeStructure;
import org.esupportail.pstagedata.domain.beans.Ufr;
import org.esupportail.pstagedata.domain.beans.UniteDuree;
import org.esupportail.pstagedata.domain.beans.UniteGratification;
import org.esupportail.pstagedata.domain.dto.AccordPartenariatDTO;
import org.esupportail.pstagedata.domain.dto.AdminStructureDTO;
import org.esupportail.pstagedata.domain.dto.AffectationDTO;
import org.esupportail.pstagedata.domain.dto.AssuranceDTO;
import org.esupportail.pstagedata.domain.dto.AvenantDTO;
import org.esupportail.pstagedata.domain.dto.CaisseRegimeDTO;
import org.esupportail.pstagedata.domain.dto.CentreGestionDTO;
import org.esupportail.pstagedata.domain.dto.CentreGestionSuperviseurDTO;
import org.esupportail.pstagedata.domain.dto.CiviliteDTO;
import org.esupportail.pstagedata.domain.dto.ConfidentialiteDTO;
import org.esupportail.pstagedata.domain.dto.ContactDTO;
import org.esupportail.pstagedata.domain.dto.ContratOffreDTO;
import org.esupportail.pstagedata.domain.dto.ConventionDTO;
import org.esupportail.pstagedata.domain.dto.CritereGestionDTO;
import org.esupportail.pstagedata.domain.dto.CritereRechercheConventionDTO;
import org.esupportail.pstagedata.domain.dto.CritereRechercheOffreDTO;
import org.esupportail.pstagedata.domain.dto.CritereRechercheStructureAdresseDTO;
import org.esupportail.pstagedata.domain.dto.CritereRechercheStructureAncienDTO;
import org.esupportail.pstagedata.domain.dto.DroitAdministrationDTO;
import org.esupportail.pstagedata.domain.dto.DureeDiffusionDTO;
import org.esupportail.pstagedata.domain.dto.EffectifDTO;
import org.esupportail.pstagedata.domain.dto.EnseignantDTO;
import org.esupportail.pstagedata.domain.dto.EtapeDTO;
import org.esupportail.pstagedata.domain.dto.EtudiantDTO;
import org.esupportail.pstagedata.domain.dto.FapN1DTO;
import org.esupportail.pstagedata.domain.dto.FapN2DTO;
import org.esupportail.pstagedata.domain.dto.FapN3DTO;
import org.esupportail.pstagedata.domain.dto.FapQualificationDTO;
import org.esupportail.pstagedata.domain.dto.FapQualificationSimplifieeDTO;
import org.esupportail.pstagedata.domain.dto.FichierDTO;
import org.esupportail.pstagedata.domain.dto.IndemnisationDTO;
import org.esupportail.pstagedata.domain.dto.LangueConventionDTO;
import org.esupportail.pstagedata.domain.dto.ModeCandidatureDTO;
import org.esupportail.pstagedata.domain.dto.ModeValidationStageDTO;
import org.esupportail.pstagedata.domain.dto.ModeVersGratificationDTO;
import org.esupportail.pstagedata.domain.dto.NafN1DTO;
import org.esupportail.pstagedata.domain.dto.NafN5DTO;
import org.esupportail.pstagedata.domain.dto.NatureTravailDTO;
import org.esupportail.pstagedata.domain.dto.NiveauCentreDTO;
import org.esupportail.pstagedata.domain.dto.NiveauFormationDTO;
import org.esupportail.pstagedata.domain.dto.OffreDTO;
import org.esupportail.pstagedata.domain.dto.OffreDiffusionDTO;
import org.esupportail.pstagedata.domain.dto.OrigineStageDTO;
import org.esupportail.pstagedata.domain.dto.PaysDTO;
import org.esupportail.pstagedata.domain.dto.PersonnelCentreGestionDTO;
import org.esupportail.pstagedata.domain.dto.ServiceDTO;
import org.esupportail.pstagedata.domain.dto.StatutJuridiqueDTO;
import org.esupportail.pstagedata.domain.dto.StructureDTO;
import org.esupportail.pstagedata.domain.dto.TempsTravailDTO;
import org.esupportail.pstagedata.domain.dto.ThemeDTO;
import org.esupportail.pstagedata.domain.dto.TicketStructureDTO;
import org.esupportail.pstagedata.domain.dto.TypeConventionDTO;
import org.esupportail.pstagedata.domain.dto.TypeOffreDTO;
import org.esupportail.pstagedata.domain.dto.TypeStructureDTO;
import org.esupportail.pstagedata.domain.dto.UfrDTO;
import org.esupportail.pstagedata.domain.dto.UniteDureeDTO;
import org.esupportail.pstagedata.domain.dto.UniteGratificationDTO;
import org.esupportail.pstagedata.utils.Utils;
import org.springframework.util.StringUtils;


/**
 * @author Matthieu Manginot : matthieu.manginot@univ-nancy2.fr
 *
 */
public class UtilsDTO {

	/* ***************************************************************
	 * Propriétés
	 ****************************************************************/

	/**
	 * Constructeur
	 */
	public UtilsDTO(){
		super();
	}

	/* ***************************************************************
	 * Getters / Setters
	 ****************************************************************/	

	/* ***************************************************************
	 * M�thodes
	 ****************************************************************/

	/* ***************************************************************
	 *            Transformation d'objet depuis un DTO
	 ****************************************************************/

	/**
	 * @param ad
	 * @return AccordPartenariat
	 */
	public static AccordPartenariat getAccordPartenariatFromDTO(AccordPartenariatDTO ad){
		AccordPartenariat a = new AccordPartenariat();
		if(ad!=null){
			a.setComptesSupprimes(ad.isComptesSupprimes());
			a.setDateCreation(ad.getDateCreation());
			a.setDateModif(ad.getDateModif());
			a.setDateSuppressionComptes(ad.getDateSuppressionComptes());
			a.setDateValidation(ad.getDateValidation());
			a.setEstValide(ad.isEstValide());
			a.setIdAccordPartenariat(ad.getIdAccordPartenariat());
			a.setIdContact(ad.getIdContact());
			a.setIdStructure(ad.getIdStructure());
			a.setLoginCreation(ad.getLoginCreation());
			a.setLoginModif(ad.getLoginModif());
			a.setLoginSuppressionComptes(ad.getLoginSuppressionComptes());
			a.setLoginValidation(ad.getLoginValidation());
			a.setRaisonSuppressionComptes(ad.getRaisonSuppressionComptes());
		}
		return a;
	}

	/**
	 * @param ad
	 * @return AdminStructure
	 */
	public static AdminStructure getAdminStructureFromDTO(AdminStructureDTO ad){
		AdminStructure a = new AdminStructure();
		if(ad!=null){
			a.setAvantDerniereConnexion(ad.getAvantDerniereConnexion());
			a.setDerniereConnexion(ad.getDerniereConnexion());
			a.setCodeUniversite(ad.getCodeUniversite());
			a.setDateCreation(ad.getDateCreation());
			a.setDateModif(ad.getDateModif());
			a.setEppn(ad.getEppn());
			a.setFax(ad.getFax());
			a.setId(ad.getId());
			if(ad.getIdCivilite()<=0)
				a.setIdCivilite(null);
			else a.setIdCivilite(ad.getIdCivilite());
			a.setLogin(ad.getLogin());
			a.setLoginCreation(ad.getLoginCreation());
			a.setLoginModif(ad.getLoginModif());
			a.setMail(ad.getMail());
			a.setMdp(ad.getMdp());
			//En majuscules
			a.setNom(StringUtils.hasText(ad.getNom())?ad.getNom().toUpperCase():null);
			//Premi�re lettre en MAJ
			a.setPrenom(Utils.premiereLettreMAJ(ad.getPrenom()));
			a.setTel(ad.getTel());
		}
		return a;
	}

	/**
	 * @param ad
	 * @return Affectation
	 */
	public static Affectation getAffectationFromDTO(AffectationDTO ad){
		Affectation a = new Affectation();
		if(ad!=null){
			a.setCode(ad.getCode());
			a.setLibelle(ad.getLibelle());
			a.setCodeUniversite(ad.getCodeUniversite());
		}
		return a;
	}

	/**
	 * @param ad
	 * @return Avenant
	 */
	public static Avenant getAvenantFromDTO(AvenantDTO ad){
		Avenant a = new Avenant();
		if(ad!=null){
			if (ad.getDateCreation() != null)
				a.setDateCreation(ad.getDateCreation());
			if (ad.getDateDebutInterruption() != null)
				a.setDateDebutInterruption(ad.getDateDebutInterruption());
			if (ad.getDateDebutStage() != null)
				a.setDateDebutStage(ad.getDateDebutStage());
			if (ad.getDateFinInterruption() != null)
				a.setDateFinInterruption(ad.getDateFinInterruption());
			if (ad.getDateFinStage() != null)
				a.setDateFinStage(ad.getDateFinStage());
			if (ad.getDateModif() != null)
				a.setDateModif(ad.getDateModif());
			if (ad.getIdAvenant() != null && ad.getIdAvenant() == 0){
				a.setIdAvenant(null);
			} else {
				a.setIdAvenant(ad.getIdAvenant());
			}
			if (ad.getIdContact() != null && ad.getIdContact() == 0){
				a.setIdContact(null);
			} else if (ad.getIdContact() != null ){
				a.setIdContact(ad.getIdContact());
			}
			if (ad.getIdConvention() != null && ad.getIdConvention() == 0){
				a.setIdConvention(null);
			} else if (ad.getIdConvention() != null ){
				a.setIdConvention(ad.getIdConvention());
			}
			if (ad.getIdEnseignant() != null && ad.getIdEnseignant() == 0){
				a.setIdEnseignant(null);
			} else if (ad.getIdEnseignant() != null ){
				a.setIdEnseignant(ad.getIdEnseignant());
			}
			if (ad.getIdService() != null && ad.getIdService() == 0){
				a.setIdService(null);
			} else if (ad.getIdService() != null ){
				a.setIdService(ad.getIdService());
			}
			if (ad.getIdUniteGratification() != null && ad.getIdUniteGratification() == 0){
				a.setIdUniteGratification(null);
			} else if (ad.getIdUniteGratification() != null ){
				a.setIdUniteGratification(ad.getIdUniteGratification());
			}
			a.setInterruptionStage(ad.isInterruptionStage());
			if (ad.getLoginCreation() != null)
				a.setLoginCreation(ad.getLoginCreation());
			if (ad.getLoginModif() != null)
				a.setLoginModif(ad.getLoginModif());
			a.setModificationEnseignant(ad.isModificationEnseignant());
			a.setModificationLieu(ad.isModificationLieu());
			a.setModificationMontantGratification(ad.isModificationMontantGratification());
			a.setModificationPeriode(ad.isModificationPeriode());
			a.setModificationSalarie(ad.isModificationSalarie());
			a.setModificationSujet(ad.isModificationSujet());
			if (ad.getMontantGratification() != null)
				a.setMontantGratification(ad.getMontantGratification());
			if (ad.getMotifAvenant() != null)
				a.setMotifAvenant(ad.getMotifAvenant());
			a.setRupture(ad.isRupture());
			if (ad.getSujetStage() != null)
				a.setSujetStage(ad.getSujetStage());
			a.setValidationAvenant(ad.isValidationAvenant());
		}
		return a;
	}
	
	/**
	 * @param cd 
	 * @return CentreGestion
	 */
	public static CentreGestion getCentreGestionFromDTO(CentreGestionDTO cd){
		CentreGestion c = new CentreGestion();
		if(cd!=null){
			c.setIdCentreGestion(cd.getIdCentreGestion());
			c.setNomCentre(cd.getNomCentre());
			c.setIdNiveauCentre(cd.getIdNiveauCentre());
			c.setBatimentResidence(cd.getBatimentResidence());
			c.setVoie(cd.getVoie());
			c.setCommune(cd.getCommune());
			c.setCodePostal(cd.getCodePostal());
			c.setSiteWeb(cd.getSiteWeb());
			c.setMail(cd.getMail());
			c.setTelephone(cd.getTelephone());
			c.setFax(cd.getFax());
			c.setCommentaire(cd.getCommentaire());
			c.setPresenceTuteurEns(cd.getPresenceTuteurEns());
			c.setPresenceTuteurPro(cd.getPresenceTuteurPro());
			c.setSaisieTuteurProParEtudiant(cd.getSaisieTuteurProParEtudiant());
			c.setChoixAnneeAvantDebutAnnee(cd.getChoixAnneeAvantDebutAnnee());
			c.setChoixAnneeApresDebutAnnee(cd.getChoixAnneeApresDebutAnnee());
			c.setCodeUniversite(cd.getCodeUniversite());
			c.setDepotAnonyme(cd.isDepotAnonyme());
			c.setAutoriserImpressionConvention(cd.isAutoriserImpressionConvention());
			c.setDateCreation(cd.getDateCreation());
			c.setLoginCreation(cd.getLoginCreation());
			c.setDateModif(cd.getDateModif());
			c.setLoginModif(cd.getLoginModif());
			c.setNomViseur(cd.getNomViseur());
			c.setPrenomViseur(cd.getPrenomViseur());
			c.setUrlPageInstruction(cd.getUrlPageInstruction());
			if(cd.getIdCentreGestionSuperViseur()<=0)
				c.setIdCentreGestionSuperViseur(null);
			else c.setIdCentreGestionSuperViseur(cd.getIdCentreGestionSuperViseur());
			c.setCodeConfidentialite(cd.getCodeConfidentialite());
			if (cd.getIdFichier() >= 0)
				c.setIdFichier(cd.getIdFichier());
		}
		return c;
	}

	/**
	 * @param cd
	 * @return CentreGestionSuperviseur
	 */
	public static CentreGestionSuperviseur getCentreGestionSuperviseurFromDTO(CentreGestionSuperviseurDTO cd){
		CentreGestionSuperviseur c = new CentreGestionSuperviseur();
		if(cd!=null){
			c.setIdCentreGestionSuperviseur(cd.getIdCentreGestionSuperviseur());
			c.setNomCentreGestionSuperviseur(cd.getNomCentreGestionSuperviseur());
		}
		return c;
	}

	/**
	 * @param cd
	 * @return Civilite
	 */
	public static Civilite getCiviliteFromDTO(CiviliteDTO cd){
		Civilite c = new Civilite();
		if(cd!=null){
			c.setId(cd.getId());
			c.setLibelle(cd.getLibelle());
		}
		return c;
	}

	/**
	 * @param cd
	 * @return Confidentialite
	 */
	public static Confidentialite getConfidentialiteFromDTO(ConfidentialiteDTO cd){
		Confidentialite c = new Confidentialite();
		if(cd!=null){
			c.setCode(cd.getCode());
			c.setLibelle(cd.getLibelle());
		}
		return c;
	}

	/**
	 * @param cd
	 * @return Contact
	 */
	public static Contact getContactFromDTO(ContactDTO cd){
		Contact c = new Contact();
		if(cd!=null){
			c.setAvantDerniereConnexion(cd.getAvantDerniereConnexion());
			c.setCodeUniversite(cd.getCodeUniversite());
			c.setCommentaire(cd.getCommentaire());
			c.setDateCreation(cd.getDateCreation());
			c.setDateModif(cd.getDateModif());
			c.setDerniereConnexion(cd.getDerniereConnexion());
			c.setFax(cd.getFax());
			c.setFonction(cd.getFonction());
			c.setId(cd.getId());
			c.setIdCentreGestion(cd.getIdCentreGestion());
			c.setIdCivilite(cd.getIdCivilite());
			c.setIdService(cd.getIdService());
			c.setInfosAJour(cd.getInfosAJour());
			c.setLogin(cd.getLogin());
			c.setLoginCreation(cd.getLoginCreation());
			c.setLoginInfosAJour(cd.getLoginInfosAJour());
			c.setLoginModif(cd.getLoginModif());
			c.setMail(cd.getMail());
			c.setMdp(cd.getMdp());
			//Nom en majuscules
			c.setNom(StringUtils.hasText(cd.getNom())?cd.getNom().toUpperCase():null);
			//1�re lettre du pr�nom en majuscules
			c.setPrenom(Utils.premiereLettreMAJ(cd.getPrenom()));
			c.setTel(cd.getTel());
		}
		return c;		
	}

	/**
	 * @param cd
	 * @return ContratOffre
	 */
	public static ContratOffre getContratOffreFromDTO(ContratOffreDTO cd){
		ContratOffre c = new ContratOffre();
		if(cd!=null){
			c.setId(cd.getId());
			c.setIdParent(cd.getIdParent());
			c.setLibelle(cd.getLibelle());
		}
		return c;
	}

	/**
	 * @param cd
	 * @return CritereGestion
	 */
	public static CritereGestion getCritereGestionFromDTO(CritereGestionDTO cd){
		CritereGestion c = new CritereGestion();
		if(cd!=null){
			c.setCode(cd.getCode());
			c.setLibelle(cd.getLibelle());
			c.setIdCentreGestion(cd.getIdCentreGestion());
		}
		return c;
	}
	
	/**
	 * @param c
	 * @return CritereRechercheConvention
	 */
	public static CritereRechercheConvention getCritereRechercheConventionFromDTO(CritereRechercheConventionDTO c){
		CritereRechercheConvention cr = new CritereRechercheConvention();
		if(c!=null){
			cr.setIdsCentreGestion(c.getIdsCentreGestion());
			cr.setIdConvention(c.getIdConvention());
			cr.setNumeroEtudiant(c.getNumeroEtudiant());
			cr.setNomEtudiant(c.getNomEtudiant());
			cr.setPrenomEtudiant(c.getPrenomEtudiant());
			cr.setSujetStage(c.getSujetStage());
			cr.setTypeConvention(UtilsDTO.getTypeConventionFromDTO(c.getTypeConvention()));
			cr.setTheme(UtilsDTO.getThemeFromDTO(c.getTheme()));
			cr.setNbJoursHebdo(c.getNbJoursHebdo());
			cr.setIndemnisation(UtilsDTO.getIndemnisationFromDTO(c.getIndemnisation()));
			cr.setTempsTravail(UtilsDTO.getTempsTravailFromDTO(c.getTempsTravail()));
			cr.setLangueConvention(UtilsDTO.getLangueConventionFromDTO(c.getLangueConvention()));
			cr.setEstValidee(c.getEstValidee());
			cr.setDateStage(c.getDateStage());
			cr.setAnneeUniversitaire(c.getAnneeUniversitaire());
			cr.setIdOffre(c.getIdOffre());
			cr.setNomEnseignant(c.getNomEnseignant());
			cr.setPrenomEnseignant(c.getPrenomEnseignant());
			cr.setIdsUfrs(c.getIdsUfrs());
			cr.setIdsEtapes(c.getIdsEtapes());
			cr.setRaisonSociale(c.getRaisonSociale());
			cr.setNumeroSiret(c.getNumeroSiret());
			cr.setCommune(c.getCommune());
			cr.setCodePostal(c.getCodePostal());
			cr.setPays(UtilsDTO.getPaysFromDTO(c.getPays()));
			cr.setTypeStructure(UtilsDTO.getTypeStructureFromDTO(c.getTypeStructure()));
			cr.setStatutJuridique(UtilsDTO.getStatutJuridiqueFromDTO(c.getStatutJuridique()));
			cr.setEffectif(UtilsDTO.getEffectifFromDTO(c.getEffectif()));
			cr.setNafN1(UtilsDTO.getNafN1FromDTO(c.getNafN1()));
			if (c.getNbExportMaxi() != null) {
				cr.setNbExportMaxi(c.getNbExportMaxi());
			}
			if (c.getNbRechercheMaxi() != null) {
				cr.setNbRechercheMaxi(c.getNbRechercheMaxi());
			}
			//cr.setLimit(c.isLimit());
		}
		return cr;
	}

	/**
	 * @param c
	 * @return CritereRechercheOffre
	 */
	public static CritereRechercheOffre getCritereRechercheOffreFromDTO(CritereRechercheOffreDTO c){
		CritereRechercheOffre cr = new CritereRechercheOffre();
		if(c!=null){
			cr.setIdsCentreGestion(c.getIdsCentreGestion());
			cr.setTypeOffre(getTypeOffreFromDTO(c.getTypeOffre()));
			cr.setContratOffre(getContratOffreFromDTO(c.getContratOffre()));
			cr.setIntitule(c.getIntitule());
			cr.setLieuCodesPostal(c.getLieuCodesPostal());
			cr.setLieuCommune(c.getLieuCommune());
			cr.setLieuPays(getPaysFromDTO(c.getLieuPays()));
			cr.setFapQualificationSimplifiee(getFapQualificationSimplifieeFromDTO(c.getFapQualificationSimplifiee()));
			cr.setFapN1(getFapN1FromDTO(c.getFapN1()));
			cr.setFapN2(getFapN2FromDTO(c.getFapN2()));
			cr.setFapN3(getFapN3FromDTO(c.getFapN3()));
			cr.setNafN1(getNafN1FromDTO(c.getNafN1()));
			cr.setNiveauFormation(getNiveauFormationFromDTO(c.getNiveauFormation()));
			cr.setEstAccessERQTH(c.isEstAccessERQTH());
			cr.setEstPrioERQTH(c.isEstPrioERQTH());
			cr.setMotsCles(c.getMotsCles());

			//Recherche admin
			cr.setIdOffre(c.getIdOffre());
			cr.setTypeStructure(getTypeStructureFromDTO(c.getTypeStructure()));
			cr.setInclureOffresEntreprise(c.isInclureOffresEntreprise());
			cr.setEstDiffusee(c.isEstDiffusee());
			cr.setDiffusionTerminee(c.isDiffusionTerminee());
			cr.setEstSupprimee(c.isEstSupprimee());
			
			cr.setAnneeUniversitaire(c.getAnneeUniversitaire());
			cr.setEstFrance(c.isEstFrance());
		}
		return cr;
	}
	
	/**
	 * @param c
	 * @return CritereRechercheOffre
	 */
	public static CritereRechercheStructureAdresse getCritereRechercheStructureAdresseFromDTO(CritereRechercheStructureAdresseDTO c){
		CritereRechercheStructureAdresse cr = new CritereRechercheStructureAdresse();
		if(c!=null){
			cr.setCodePostal(c.getCodePostal());
			cr.setRechBatimentResidence(c.getRechBatimentResidence());
			cr.setRechPays(getPaysFromDTO(c.getRechPays()));
			cr.setRechVille(c.getRechVille());
			cr.setRechVoie(c.getRechVoie());
		}
		return cr;
	}
	
	/**
	 * @param c
	 * @return CritereRechercheOffre
	 */
	public static CritereRechercheStructureAncien getCritereRechercheStructureAncienFromDTO(CritereRechercheStructureAncienDTO c){
		CritereRechercheStructureAncien cr = new CritereRechercheStructureAncien();
		if(c!=null){
			cr.setRaisonSociale(c.getRaisonSociale());
			cr.setNumeroSiret(c.getNumeroSiret());
			cr.setCodePostal(c.getCodePostal());
			cr.setNafN1(getNafN1FromDTO(c.getNafN1()));
			cr.setNafN5(getNafN5FromDTO(c.getNafN5()));
			cr.setDepartement(c.getDepartement());
		}
		return cr;
	}

	/**
	 * @param dd
	 * @return DroitAdministration
	 */
	public static DroitAdministration getDroitAdministrationFromDTO(DroitAdministrationDTO dd){
		DroitAdministration c = new DroitAdministration();
		if(dd!=null){
			c.setId(dd.getId());
			c.setLibelle(dd.getLibelle());
		}
		return c;
	}

	/**
	 * @param dd
	 * @return DureeDiffusion
	 */
	public static DureeDiffusion getDureeDiffusionFromDTO(DureeDiffusionDTO dd){
		DureeDiffusion d = new DureeDiffusion();
		if(dd!=null){
			d.setId(dd.getId());
			d.setLibelle(dd.getLibelle());
			d.setAdminSeulement(dd.isAdminSeulement());
		}
		return d;
	}
	
	/**
	 * @param ed
	 * @return Effectif
	 */
	public static Effectif getEffectifFromDTO(EffectifDTO ed){
		Effectif e = new Effectif();
		if(ed!=null){
			e.setId(ed.getId());
			e.setLibelle(ed.getLibelle());
		}
		return e;
	}

	/**
	 * @param fd
	 * @return FapN1
	 */
	public static FapN1 getFapN1FromDTO(FapN1DTO fd){
		FapN1 f = new FapN1();
		if(fd!=null){
			f.setCode(fd.getCode());
			f.setLibelle(fd.getLibelle());
		}
		return f;
	}


	/**
	 * @param fd
	 * @return FapN2
	 */
	public static FapN2 getFapN2FromDTO(FapN2DTO fd){
		FapN2 f = new FapN2();
		if(fd!=null){
			f.setCode(fd.getCode());
			f.setCodeParent(fd.getCodeParent());
			f.setLibelle(fd.getLibelle());
		}
		return f;
	}

	/**
	 * @param fd
	 * @return FapN3
	 */
	public static FapN3 getFapN3FromDTO(FapN3DTO fd){
		FapN3 f = new FapN3();
		if(fd!=null){
			f.setCode(fd.getCode());
			f.setCodeParent(fd.getCodeParent());
			f.setLibelle(fd.getLibelle());
			f.setNumQualification(fd.getNumQualification());
		}
		return f;
	}

	/**
	 * @param fd
	 * @return FapQualification
	 */
	public static FapQualification getFapQualificationFromDTO(FapQualificationDTO fd){
		FapQualification f = new FapQualification();
		if(fd!=null){
			f.setId(fd.getId());
			f.setIdParent(fd.getIdParent());
			f.setLibelle(fd.getLibelle());
		}
		return f;
	}

	/**
	 * @param fd
	 * @return FapQualificationSimplifiee
	 */
	public static FapQualificationSimplifiee getFapQualificationSimplifieeFromDTO(FapQualificationSimplifieeDTO fd){
		FapQualificationSimplifiee f = new FapQualificationSimplifiee();
		if(fd!=null){
			f.setId(fd.getId());
			f.setLibelle(fd.getLibelle());
		}
		return f;
	}

	/**
	 * @param md
	 * @return ModeCandidature
	 */
	public static ModeCandidature getModeCandidatureFromDTO(ModeCandidatureDTO md){
		ModeCandidature m = new ModeCandidature();
		if(md!=null){
			m.setId(md.getId());
			m.setLibelle(md.getLibelle());
		}
		return m;
	}

	/**
	 * @param nd
	 * @return NafN1
	 */
	public static NafN1 getNafN1FromDTO(NafN1DTO nd){
		NafN1 n = new NafN1();
		if(nd!=null){
			n.setCode(nd.getCode());
			n.setLibelle(nd.getLibelle());
		}
		return n;
	}

	/**
	 * @param nd
	 * @return NafN5
	 */
	public static NafN5 getNafN5FromDTO(NafN5DTO nd){
		NafN5 n = new NafN5();
		if(nd!=null){
			n.setCode(nd.getCode());
			n.setCodeParent(nd.getCodeParent());
			n.setLibelle(nd.getLibelle());
		}
		return n;
	}

	/**
	 * @param nd
	 * @return NiveauCentre
	 */
	public static NiveauCentre getNiveauCentreFromDTO(NiveauCentreDTO nd){
		NiveauCentre n = new NiveauCentre();
		if(nd!=null){
			n.setId(nd.getId());
			n.setLibelle(nd.getLibelle());
		}
		return n;
	}

	/**
	 * @param nd
	 * @return NiveauFormation
	 */
	public static NiveauFormation getNiveauFormationFromDTO(NiveauFormationDTO nd){
		NiveauFormation n = new NiveauFormation();
		if(nd!=null){
			n.setId(nd.getId());
			n.setLibelle(nd.getLibelle());
		}
		return n;
	}

	/**
	 * @param od
	 * @return Offre
	 */
	public static Offre getOffreFromDTO(OffreDTO od){
		Offre o = null;
		if(od!=null){
			o=new Offre();
			o.setAnneeDebut(od.getAnneeDebut());
			o.setAvantages(od.getAvantages());
			o.setCacherEtablissement(od.isCacherEtablissement());
			o.setCacherFaxContactCand(od.isCacherFaxContactCand());
			o.setCacherFaxContactInfo(od.isCacherFaxContactInfo());
			o.setCacherMailContactCand(od.isCacherMailContactCand());
			o.setCacherMailContactInfo(od.isCacherMailContactInfo());
			o.setCacherTelContactCand(od.isCacherTelContactCand());
			o.setCacherTelContactInfo(od.isCacherTelContactInfo());
			o.setCacherNomContactCand(od.isCacherNomContactCand());
			o.setCacherNomContactInfo(od.isCacherNomContactInfo());
			o.setCodeCommune(od.getCodeCommune());
			o.setCodeROM(od.getCodeROM());
			o.setCommentaireTempsTravail(Utils.premiereLettreMAJ(od.getCommentaireTempsTravail()));
			o.setCompetences(Utils.premiereLettreMAJ(od.getCompetences()));
			o.setDateCreation(od.getDateCreation());
			o.setDateDiffusion(od.getDateDiffusion());
			o.setDateFinDiffusion(od.getDateFinDiffusion());
			o.setDateModif(od.getDateModif());
			o.setDateStopDiffusion(od.getDateStopDiffusion());
			o.setDateValidation(od.getDateValidation());
			o.setDeplacement(od.isDeplacement());
			o.setDescription(Utils.premiereLettreMAJ(od.getDescription()));
			if(od.getDuree()<=0) o.setDuree(null);
			else o.setDuree(od.getDuree());
			o.setEstAccessERQTH(od.isEstAccessERQTH());
			o.setEstDiffusee(od.isEstDiffusee());
			o.setEstPrioERQTH(od.isEstPrioERQTH());
			o.setEstSupprimee(od.isEstSupprimee());
			o.setEstPourvue(od.isEstPourvue());
			o.setEstValidee(od.isEstValidee());
			o.setEtatValidation(od.getEtatValidation());
			o.setAvecFichier(od.isAvecFichier());
			o.setAvecLien(od.isAvecLien());
			if(od.getIdFichier()>0) o.setIdFichier(od.getIdFichier());
			else o.setIdFichier(null);
			o.setLienAttache(od.getLienAttache());
			o.setIdCentreGestion(od.getIdCentreGestion());
			if(od.getIdContactCand()>0) o.setIdContactCand(od.getIdContactCand());
			else o.setIdContactCand(null);
			if(od.getIdContactInfo()>0) o.setIdContactInfo(od.getIdContactInfo());
			else o.setIdContactInfo(null);
			if(od.getIdContactProprio()>0)o.setIdContactProprio(od.getIdContactProprio());
			else o.setIdContactProprio(null);
			if(od.getIdContratOffre()>0)o.setIdContratOffre(od.getIdContratOffre());
			else o.setIdContratOffre(null);
			if(StringUtils.hasText(od.getCodeFAP_N3())) o.setCodeFAP_N3(od.getCodeFAP_N3());
			else o.setCodeFAP_N3(null);
			if(od.getIdLieuPays()>0)o.setIdLieuPays(od.getIdLieuPays());
			else o.setIdLieuPays(null);
			o.setIdsModeCandidature(od.getIdsModeCandidature());
			if(od.getIdNiveauFormation()>0) o.setIdNiveauFormation(od.getIdNiveauFormation());
			else o.setIdNiveauFormation(null);
			o.setIdOffre(od.getIdOffre());
			if(od.getIdQualificationSimplifiee()>0)o.setIdQualificationSimplifiee(od.getIdQualificationSimplifiee());
			else o.setIdQualificationSimplifiee(null);
			if(od.getIdReferent()>0) o.setIdReferent(od.getIdReferent());
			else o.setIdReferent(null);
			o.setIdStructure(od.getIdStructure());
			if(od.getIdTempsTravail()>0) o.setIdTempsTravail(od.getIdTempsTravail());
			else o.setIdTempsTravail(null);
			o.setIdTypeOffre(od.getIdTypeOffre());
			if(od.getIdUniteDuree()>0) o.setIdUniteDuree(od.getIdUniteDuree());
			else o.setIdUniteDuree(null);
			o.setIntitule(StringUtils.hasText(od.getIntitule())?od.getIntitule().toUpperCase():null);
			o.setLieuCodePostal(od.getLieuCodePostal());
			o.setLieuCommune(od.getLieuCommune());
			o.setLoginCreation(od.getLoginCreation());
			o.setLoginDiffusion(od.getLoginDiffusion());
			o.setLoginModif(od.getLoginModif());
			o.setLoginStopDiffusion(od.getLoginStopDiffusion());
			o.setLoginStopValidation(od.getLoginStopValidation());
			o.setLoginValidation(od.getLoginValidation());
			o.setMoisDebut(od.getMoisDebut());
			o.setObservations(Utils.premiereLettreMAJ(od.getObservations()));
			o.setPermis(od.isPermis());
			o.setPrecisionDebut(Utils.premiereLettreMAJ(od.getPrecisionDebut()));
			o.setPrecisionRemuneration(Utils.premiereLettreMAJ(od.getPrecisionRemuneration()));
			o.setQuotiteTravail(od.getQuotiteTravail());
			o.setReferenceOffreEtablissement(od.getReferenceOffreEtablissement());
			o.setRemuneration(od.isRemuneration());
			o.setVoiture(od.isVoiture());
			o.setAnneeUniversitaire(od.getAnneeUniversitaire());
		}
		return o;
	}

	/**
	 * @param od
	 * @return OffreFichier
	 */
	public static Fichier getOffreFichierFromDTO(FichierDTO od){
		Fichier o = null;
		if(od!=null){
			o = new Fichier();
			o.setIdFichier(od.getIdFichier());
			o.setNomFichier(od.getNomFichier());
			o.setNomReel(od.getNomReel());
		}
		return o;
	}

	/**
	 * @param od
	 * @return OffreDiffusion
	 */
	public static OffreDiffusion getOffreDiffusionFromDTO(OffreDiffusionDTO od){
		OffreDiffusion o = null;
		if(od!=null){
			o=new OffreDiffusion();
			o.setIdCentreGestion(od.getIdCentreGestion());
			o.setIdOffre(od.getIdOffre());
			o.setNomCentre(od.getNomCentre());
			o.setEstMiseEnAvant(od.isEstMiseEnAvant());
		}
		return o;
	}

	/**
	 * @param pd
	 * @return Pays
	 */
	public static Pays getPaysFromDTO(PaysDTO pd){
		Pays p = null;
		if(pd!=null){
			p = new Pays();
			p.setActual(pd.getActual());
			p.setCog(pd.getCog());
			p.setCrpay(pd.getCrpay());
			p.setId(pd.getId());
			p.setIso2(pd.getIso2());
			p.setLibelle(pd.getLibelle());
			p.setSiretObligatoire(pd.isSiretObligatoire());
		}
		return p;
	}

	/**
	 * @param pd
	 * @return PersonnelCentreGestion
	 */
	public static PersonnelCentreGestion getPersonnelCentreGestionFromDTO(PersonnelCentreGestionDTO pd){
		PersonnelCentreGestion pg = new PersonnelCentreGestion();
		if(pd!=null){
			pg.setId(pd.getId());
			pg.setIdCentreGestion(pd.getIdCentreGestion());
			pg.setUidPersonnel(pd.getUidPersonnel());
			pg.setNom(pd.getNom());
			pg.setPrenom(pd.getPrenom());
			pg.setMail(pd.getMail());
			pg.setTel(pd.getTel());
			pg.setFax(pd.getFax());
			pg.setFonction(pd.getFonction());
			pg.setIdDroitAdmin(pd.getIdDroitAdmin());
			pg.setIdCivilite(pd.getIdCivilite());
			pg.setImpressionConvention(pd.getImpressionConvention());
			pg.setCodeUniversite(pd.getCodeUniversite());
			pg.setCampus(pd.getCampus());
			pg.setBatiment(pd.getBatiment());
			pg.setBureau(pd.getBureau());
			pg.setLoginCreation(pd.getLoginCreation());
			pg.setDateCreation(pd.getDateCreation());
			pg.setLoginModif(pd.getLoginModif());
			pg.setDateModif(pd.getDateModif());
			pg.setCodeAffectation(pd.getCodeAffectation());
			pg.setCodeUniversiteAffectation(pd.getCodeUniversiteAffectation());
		}
		return pg;
	}

	/**
	 * @param sd
	 * @return Service
	 */
	public static Service getServiceFromDTO(ServiceDTO sd){
		Service s = new Service();
		if(sd!=null){
			s.setBatimentResidence(Utils.premiereLettreMAJ(sd.getBatimentResidence()));
			s.setCodeCommune(sd.getCodeCommune());
			s.setCodePostal(sd.getCodePostal());
			//En majuscules
			s.setCommune(StringUtils.hasText(sd.getCommune())?sd.getCommune().toUpperCase():null);
			s.setDateCreation(sd.getDateCreation());
			s.setDateModif(sd.getDateModif());
			s.setIdPays(sd.getIdPays());
			s.setIdService(sd.getIdService());
			s.setIdStructure(sd.getIdStructure());
			s.setInfosAJour(sd.getInfosAJour());
			s.setLibCedex(Utils.premiereLettreMAJ(sd.getLibCedex()));
			s.setLoginCreation(sd.getLoginCreation());
			s.setLoginInfosAJour(sd.getLoginInfosAJour());
			s.setLoginModif(sd.getLoginModif());
			//En majuscules
			s.setNom(StringUtils.hasText(sd.getNom())?sd.getNom().toUpperCase():null);
			s.setVoie(Utils.premiereLettreMAJ(sd.getVoie()));
		}
		return s;		
	}

	/**
	 * @param sd
	 * @return StatutJuridique
	 */
	public static StatutJuridique getStatutJuridiqueFromDTO(StatutJuridiqueDTO sd){
		StatutJuridique s = new StatutJuridique();
		if(sd!=null){
			s.setId(sd.getId());
			s.setIdParent(sd.getIdParent());
			s.setLibelle(sd.getLibelle());
		}
		return s;
	}

	/**
	 * @param sd
	 * @return Structure
	 */
	public static Structure getStructureFromDTO(StructureDTO sd){
		Structure s = new Structure();
		if(sd!=null){
			s.setActivitePrincipale(Utils.premiereLettreMAJ(sd.getActivitePrincipale()));
			s.setBatimentResidence(Utils.premiereLettreMAJ(sd.getBatimentResidence()));
			s.setCodeCommune(sd.getCodeCommune());
			s.setCodeEtab(sd.getCodeEtab());
			if(!StringUtils.hasText(sd.getCodeNAF_N5()))
				s.setCodeNAF_N5(null);
			else s.setCodeNAF_N5(sd.getCodeNAF_N5());
			s.setCodePostal(sd.getCodePostal());
			//En majuscules
			s.setCommune(StringUtils.hasText(sd.getCommune())?sd.getCommune().toUpperCase():null);
			s.setDateCreation(sd.getDateCreation());
			s.setDateModif(sd.getDateModif());
			s.setDateValidation(sd.getDateValidation());
			s.setEstValidee(s.isEstValidee());
			s.setFax(sd.getFax());
			// Groupe transform� sans accent et en majuscules pour homog�n�iser
			s.setGroupe(Utils.sansAccentEnMAJ(sd.getGroupe()));
			s.setIdEffectif(sd.getIdEffectif());
			s.setIdPays(sd.getIdPays());
			if(sd.getIdStatutJuridique()<=0)
				s.setIdStatutJuridique(null);
			else s.setIdStatutJuridique(sd.getIdStatutJuridique());
			s.setIdStructure(sd.getIdStructure());
			s.setIdTypeStructure(sd.getIdTypeStructure());
			s.setInfosAJour(sd.getInfosAJour());
			s.setLibCedex(Utils.premiereLettreMAJ(sd.getLibCedex()));
			s.setLoginCreation(sd.getLoginCreation());
			s.setLoginInfosAJour(sd.getLoginInfosAJour());
			s.setLoginModif(sd.getLoginModif());
			s.setLoginValidation(sd.getLoginValidation());
			s.setLogo(sd.getLogo());
			s.setMail(sd.getMail());
			s.setNumeroSiret(sd.getNumeroSiret());
			// Raison sociale transform�e sans accent et en majuscules pour homog�n�isation
			s.setRaisonSociale(Utils.sansAccentEnMAJ(sd.getRaisonSociale()));
			s.setSiteWeb(sd.getSiteWeb());
			s.setTelephone(sd.getTelephone());
			s.setVoie(sd.getVoie());
		}
		return s;		
	}

	/**
	 * @param td
	 * @return TempsTravail
	 */
	public static TempsTravail getTempsTravailFromDTO(TempsTravailDTO td){
		TempsTravail t = new TempsTravail();
		if(td!=null){
			t.setId(td.getId());
			t.setLibelle(td.getLibelle());
			t.setCodeCtrl(td.getCodeCtrl());
		}
		return t;
	}
	
	
	/**
	 * @param tsd
	 * @return TicketStructure
	 */
	public static TicketStructure getTicketStructureFromDTO(TicketStructureDTO tsd){
		TicketStructure ts = null;
		if(tsd!=null){
			ts = new TicketStructure();
			ts.setTicket(tsd.getTicket());
			ts.setIdStructure(tsd.getIdStructure());

		}
		return ts;
	}

	/**
	 * @param td
	 * @return TypeOffre
	 */
	public static TypeOffre getTypeOffreFromDTO(TypeOffreDTO td){
		TypeOffre t = new TypeOffre();
		if(td!=null){
			t.setId(td.getId());
			t.setLibelle(td.getLibelle());
		}
		return t;
	}

	/**
	 * @param td
	 * @return TypeStructure
	 */
	public static TypeStructure getTypeStructureFromDTO(TypeStructureDTO td){
		TypeStructure t = new TypeStructure();
		if(td!=null){
			t.setId(td.getId());
			t.setLibelle(td.getLibelle());
			t.setSiretObligatoire(td.isSiretObligatoire());
		}
		return t;
	}

	/**
	 * @param ud
	 * @return UniteDuree
	 */
	public static UniteDuree getUniteDureeFromDTO(UniteDureeDTO ud){
		UniteDuree u = new UniteDuree();
		if(ud!=null){
			u.setId(ud.getId());
			u.setLibelle(ud.getLibelle());
		}
		return u;
	}


	/**
	 * @param ass
	 * @return Assurance
	 */
	public static Assurance getAssuranceFromDTO(AssuranceDTO ass){
		Assurance a = new Assurance();
		if(ass!=null){
			a.setId(ass.getId());
			a.setLibelle(ass.getLibelle());
		}
		return a;
	}

	/**
	 * @param oDTO
	 * @return CaisseRegime
	 */
	public static CaisseRegime getCaisseRegimeFromDTO(CaisseRegimeDTO oDTO){
		CaisseRegime o = new CaisseRegime();
		if(oDTO!=null){
			o.setCode(oDTO.getCode());
			o.setLibelle(oDTO.getLibelle());
			o.setInfoCaisse(oDTO.getInfoCaisse());
		}
		return o;
	}

	/**
	 * @param oDTO
	 * @return Enseignant
	 */
	public static Enseignant getEnseignantFromDTO(EnseignantDTO oDTO){
		Enseignant o = new Enseignant();
		if(oDTO!=null){
			o.setAvantDerniereConnexion(oDTO.getAvantDerniereConnexion());
			o.setBatiment(oDTO.getBatiment());
			o.setBureau(oDTO.getBureau());
			o.setCampus(oDTO.getCampus());
			o.setCodeAffectation(oDTO.getCodeAffectation());
			o.setCodeUniversiteAffectation(oDTO.getCodeUniversiteAffectation());
			o.setCodeUniversite(oDTO.getCodeUniversite());
			o.setDateCreation(oDTO.getDateCreation());
			o.setDateModif(oDTO.getDateModif());
			o.setDerniereConnexion(oDTO.getDerniereConnexion());
			o.setFax(oDTO.getFax());
			o.setId(oDTO.getId());
			o.setLoginCreation(oDTO.getLoginCreation());
			o.setIdCivilite(oDTO.getIdCivilite());
			o.setLoginModif(oDTO.getLoginModif());
			o.setMail(oDTO.getMail());
			o.setNom(oDTO.getNom());
			o.setPrenom(oDTO.getPrenom());
			o.setTel(oDTO.getTel());
			o.setUidEnseignant(oDTO.getUidEnseignant());
			if (oDTO.getTypePersonne() != null) {
				o.setTypePersonne(oDTO.getTypePersonne());
			}
		}
		return o;
	}

	/**
	 * @param oDTO
	 * @return Etape
	 */
	public static Etape getEtapeFromDTO(EtapeDTO oDTO){
		Etape o = new Etape();
		if(oDTO!=null){
			o.setCode(oDTO.getCode());
			o.setLibelle(oDTO.getLibelle());
			o.setCodeUniversite(oDTO.getCodeUniversite());
		}
		return o;
	}

	/**
	 * @param oDTO
	 * @return LangueConvention
	 */
	public static LangueConvention getLangueConventionFromDTO(LangueConventionDTO oDTO){
		LangueConvention o = new LangueConvention();
		if(oDTO!=null){
			o.setCode(oDTO.getCode());
			o.setLibelle(oDTO.getLibelle());
		}
		return o;
	}

	/**
	 * @param oDTO
	 * @return Indemnisation
	 */
	public static Indemnisation getIndemnisationFromDTO(IndemnisationDTO oDTO){
		Indemnisation o = new Indemnisation();
		if(oDTO!=null){
			o.setId(oDTO.getId());
			o.setLibelle(oDTO.getLibelle());
		}
		return o;
	}

	/**
	 * @param oDTO
	 * @return NatureTravail
	 */
	public static NatureTravail getNatureTravailFromDTO(NatureTravailDTO oDTO){
		NatureTravail o = new NatureTravail();
		if(oDTO!=null){
			o.setId(oDTO.getId());
			o.setLibelle(oDTO.getLibelle());
		}
		return o;
	}

	/**
	 * @param oDTO
	 * @return Theme
	 */
	public static Theme getThemeFromDTO(ThemeDTO oDTO){
		Theme o = new Theme();
		if(oDTO!=null){
			o.setId(oDTO.getId());
			o.setLibelle(oDTO.getLibelle());
		}
		return o;
	}

	/**
	 * @param oDTO
	 * @return TypeConvention
	 */
	public static TypeConvention getTypeConventionFromDTO(TypeConventionDTO oDTO){
		TypeConvention o = new TypeConvention();
		if(oDTO!=null){
			o.setId(oDTO.getId());
			o.setLibelle(oDTO.getLibelle());
			o.setCodeCtrl(oDTO.getCodeCtrl());
		}
		return o;
	}

	/**
	 * @param oDTO
	 * @return Ufr
	 */
	public static Ufr getUfrFromDTO(UfrDTO oDTO){
		Ufr o = new Ufr();
		if(oDTO!=null){
			o.setCode(oDTO.getCode());
			o.setLibelle(oDTO.getLibelle());
			o.setCodeUniversite(oDTO.getCodeUniversite());
		}
		return o;
	}

	/**
	 * @param oDTO
	 * @return UniteGratification
	 */
	public static UniteGratification getUniteGratificationFromDTO(UniteGratificationDTO oDTO){
		UniteGratification o = new UniteGratification();
		if(oDTO!=null){
			o.setId(oDTO.getId());
			o.setLibelle(oDTO.getLibelle());
		}
		return o;
	}

	/**
	 * @param oDTO
	 * @return  ModeValidationStage
	 */
	public static ModeValidationStage getModeValidationStageFromDTO(ModeValidationStageDTO oDTO){
		ModeValidationStage o = new ModeValidationStage();
		if(oDTO!=null){
			o.setId(oDTO.getId());
			o.setLibelle(oDTO.getLibelle());
		}
		return o;
	}

	/**
	 * @param oDTO
	 * @return  ModeVersGratification
	 */
	public static ModeVersGratification getModeVersGratificationFromDTO(ModeVersGratificationDTO oDTO){
		ModeVersGratification o = new ModeVersGratification();
		if(oDTO!=null){
			o.setId(oDTO.getId());
			o.setLibelle(oDTO.getLibelle());
		}
		return o;
	}

	/**
	 * @param oDTO
	 * @return Convention
	 */
	public static Convention getConventionFromDTO(ConventionDTO oDTO){
		Convention o = new Convention();
		if(oDTO!=null){
			o.setAdresseEtabRef(oDTO.getAdresseEtabRef());
			o.setAdresseEtudiant(oDTO.getAdresseEtudiant());
			o.setAnnee(oDTO.getAnnee());
			o.setAvantagesNature(oDTO.getAvantagesNature());
			o.setCodeCursusLMD(oDTO.getCodeCursusLMD());
			o.setCodeDepartement(oDTO.getCodeDepartement());
			o.setCodeElp(oDTO.getCodeElp());
			o.setCodeEtape(oDTO.getCodeEtape());
			o.setCodeUniversiteEtape(oDTO.getCodeUniversiteEtape());
			o.setCodeFinalite(oDTO.getCodeFinalite());
			o.setCodeLangueConvention(oDTO.getCodeLangueConvention());
			o.setCodePostalEtudiant(oDTO.getCodePostalEtudiant());
			o.setCodeRGI(oDTO.getCodeRGI());
			o.setCodeUFR(oDTO.getCodeUFR());
			o.setCodeUniversiteUFR(oDTO.getCodeUniversiteUFR());
			o.setCommentaireDureeTravail(oDTO.getCommentaireDureeTravail());
			o.setCommentaireStage(oDTO.getCommentaireStage());
			o.setConventionStructure(oDTO.isConventionStructure());
			o.setConversionEnContrat(oDTO.isConversionEnContrat());
			o.setCourrielPersoEtudiant(oDTO.getCourrielPersoEtudiant());
			o.setCreditECTS(oDTO.getCreditECTS());
			o.setDateCreation(oDTO.getDateCreation());
			o.setDateDebutInterruption(oDTO.getDateDebutInterruption());
			o.setDateDebutStage(oDTO.getDateDebutStage());
			o.setDateFinInterruption(oDTO.getDateFinInterruption());
			o.setDateFinStage(oDTO.getDateFinStage());
			o.setDateModif(oDTO.getDateModif());
			o.setDateSignature(oDTO.getDateSignature());
			o.setDateValidation(oDTO.getDateValidation());
			o.setDetails(oDTO.getDetails());
			o.setDureeExceptionnelle(oDTO.getDureeExceptionnelle());
			o.setDureeStage(oDTO.getDureeStage());
			o.setFonctionsEtTaches(oDTO.getFonctionsEtTaches());
			o.setIdAssurance(oDTO.getIdAssurance());
			o.setCodeCaisse(oDTO.getCodeCaisse());
			o.setIdCentreGestion(oDTO.getIdCentreGestion());
			if(oDTO.getIdContact()<=0)
				o.setIdContact(null);
			else o.setIdContact(oDTO.getIdContact());
			o.setIdConvention(oDTO.getIdConvention());
			if(oDTO.getIdEnseignant()<=0)
				o.setIdEnseignant(null);
			else o.setIdEnseignant(oDTO.getIdEnseignant());
			o.setIdEtudiant(oDTO.getIdEtudiant());
			if(oDTO.getIdFicheEvaluation()<=0)
				o.setIdFicheEvaluation(null);
			else o.setIdFicheEvaluation(oDTO.getIdFicheEvaluation());
			o.setIdIndemnisation(oDTO.getIdIndemnisation());
			o.setIdModeValidationStage(oDTO.getIdModeValidationStage());
			o.setIdModeVersGratification(oDTO.getIdModeVersGratification());
			o.setIdNatureTravail(oDTO.getIdNatureTravail());
			if(oDTO.getIdOffre()<=0)
				o.setIdOffre(null);
			else o.setIdOffre(oDTO.getIdOffre());
			if(oDTO.getIdService()<=0)
				o.setIdService(null);
			else o.setIdService(oDTO.getIdService());
			if(oDTO.getIdSignataire()<=0)
				o.setIdSignataire(null);
			else o.setIdSignataire(oDTO.getIdSignataire());
			if(oDTO.getIdStructure()<=0)
				o.setIdStructure(null);
			else o.setIdStructure(oDTO.getIdStructure());
			o.setIdTempsTravail(oDTO.getIdTempsTravail());
			o.setIdTheme(oDTO.getIdTheme());
			o.setIdTypeConvention(oDTO.getIdTypeConvention());
			if(oDTO.getIdUniteDureeExceptionnelle()<=0)
				o.setIdUniteDureeExceptionnelle(null);
			else o.setIdUniteDureeExceptionnelle(oDTO.getIdUniteDureeExceptionnelle());
			
			if(oDTO.getIdUniteGratification()<=0)
				o.setIdUniteGratification(null);
			else o.setIdUniteGratification(oDTO.getIdUniteGratification());
			o.setInsee(oDTO.getInsee());
			o.setInterruptionStage(oDTO.isInterruptionStage());
			o.setLibelleCPAM(oDTO.getLibelleCPAM());
			o.setLibelleELP(oDTO.getLibelleELP());
			o.setLibelleFinalite(oDTO.getLibelleFinalite());
			o.setLoginCreation(oDTO.getLoginCreation());
			o.setLoginModif(oDTO.getLoginModif());
			o.setLoginSignature(oDTO.getLoginSignature());
			o.setLoginValidation(oDTO.getLoginValidation());
			o.setModeEncadreSuivi(oDTO.getModeEncadreSuivi());
			o.setMontantGratification(oDTO.getMontantGratification());
			o.setNbHeuresHebdo(oDTO.getNbHeuresHebdo());
			o.setNbJoursHebdo(oDTO.getNbJoursHebdo());
			o.setNomEtabRef(oDTO.getNomEtabRef());
			o.setNomSignataireComposante(oDTO.getNomSignataireComposante());
			if(oDTO.getIdOrigineStage()<=0)
				o.setIdOrigineStage(null);
			else o.setIdOrigineStage(oDTO.getIdOrigineStage());
			o.setPaysEtudiant(oDTO.getPaysEtudiant());
			o.setPriseEnChargeFraisMission(oDTO.isPriseEnChargeFraisMission());
			o.setQualiteSignataire(oDTO.getQualiteSignataire());
			o.setQuotiteTravail(oDTO.getQuotiteTravail());
			o.setSujetStage(oDTO.getSujetStage());
			o.setTelEtudiant(oDTO.getTelEtudiant());
			o.setTelPortableEtudiant(oDTO.getTelPortableEtudiant());
			o.setTemConfSujetTeme(oDTO.getTemConfSujetTeme());
			o.setTravailNuitFerie(oDTO.getTravailNuitFerie());
			o.setValidationConvention(oDTO.isValidationConvention());
			o.setVilleEtudiant(oDTO.getVilleEtudiant());
			
		}
		return o;
	}
	
	
	/**
	 * @param oDTO
	 * @return Etudiant
	 */
	public static Etudiant getEtudiantFromDTO(EtudiantDTO oDTO){
		Etudiant o = new Etudiant();
		if(oDTO!=null){
			o.setId(oDTO.getId());
			o.setCodeSexe(oDTO.getCodeSexe());
			o.setCodeUniversite(oDTO.getCodeUniversite());
			o.setDateCreation(oDTO.getDateCreation());
			o.setDateModif(oDTO.getDateModif());
			o.setDateNais(oDTO.getDateNais());
			o.setIdCivilite(oDTO.getIdCivilite());
			o.setIdentEtudiant(oDTO.getIdentEtudiant());
			o.setLoginCreation(oDTO.getLoginCreation());
			o.setLoginModif(oDTO.getLoginModif());
			o.setMail(oDTO.getMail());
			o.setNom(oDTO.getNom());
			o.setNomMarital(oDTO.getNomMarital());
			o.setNumEtudiant(oDTO.getNumEtudiant());
			o.setNumSS(oDTO.getNumSS());
			o.setPrenom(oDTO.getPrenom());
			o.setTel(oDTO.getTel());
		}
		return o;
	}
	
	
	/**
	 * @param oDTO
	 * @return OrigineStage
	 */
	public static OrigineStage getOrigineStageFromDTO(OrigineStageDTO oDTO){
		OrigineStage o = new OrigineStage();
		if(oDTO!=null){
			o.setId(oDTO.getId());
			o.setLibelle(oDTO.getLibelle());
		}
		return o;
	}
	/* ***************************************************************
	 *            Transformation dune liste vers une liste DTO
	 ****************************************************************/

	/**
	 * @param l
	 * @return List<AccordPartenariatDTO>
	 */
	public static List<AccordPartenariatDTO> getAccordPartenaraitListDTO(List<AccordPartenariat> l){
		List<AccordPartenariatDTO> ld = (l==null||l.isEmpty())?null:new ArrayList<AccordPartenariatDTO>();
		if(l!=null){
			for(AccordPartenariat a : l){
				ld.add(new AccordPartenariatDTO(a));
			}
		}
		return ld;
	}
	/**
	 * @param l
	 * @return List<AdminStructureDTO>
	 */
	public static List<AdminStructureDTO> getAdminStructureListDTO(List<AdminStructure> l){
		List<AdminStructureDTO> ld = (l==null||l.isEmpty())?null:new ArrayList<AdminStructureDTO>();
		if(l!=null){
			for(AdminStructure a : l){
				ld.add(new AdminStructureDTO(a));
			}
		}
		return ld;
	}

	/**
	 * @param l
	 * @return List<AffectationDTO>
	 */
	public static List<AffectationDTO> getAffectationListDTO(List<Affectation> l){
		List<AffectationDTO> ld = (l==null||l.isEmpty())?null:new ArrayList<AffectationDTO>();
		if(l!=null){
			for(Affectation a : l){
				ld.add(new AffectationDTO(a));
			}
		}
		return ld;
	}

	/**
	 * @param l
	 * @return List<AvenantDTO>
	 */
	public static List<AvenantDTO> getAvenantListDTO(List<Avenant> l){
		List<AvenantDTO> ld = (l==null||l.isEmpty())?null:new ArrayList<AvenantDTO>();
		if(l!=null){
			for(Avenant a : l){
				ld.add(new AvenantDTO(a));
			}
		}
		return ld;
	}
	
	/**
	 * @param l
	 * @return List<CentreGestionDTO>
	 */
	public static List<CentreGestionDTO> getCentreGestionListDTO(List<CentreGestion> l){
		List<CentreGestionDTO> ld = (l==null||l.isEmpty())?null:new ArrayList<CentreGestionDTO>();
		if(l!=null){
			for(CentreGestion cg : l){
				ld.add(new CentreGestionDTO(cg));
			}
		}
		return ld;
	}

	/**
	 * @param l
	 * @return List<CentreGestionSuperviseurDTO>
	 */
	public static List<CentreGestionSuperviseurDTO> getCentreGestionSuperviseurListDTO(List<CentreGestionSuperviseur> l){
		List<CentreGestionSuperviseurDTO> ld = (l==null||l.isEmpty())?null:new ArrayList<CentreGestionSuperviseurDTO>();
		if(l!=null){
			for(CentreGestionSuperviseur cg : l){
				ld.add(new CentreGestionSuperviseurDTO(cg));
			}
		}
		return ld;
	}

	/**
	 * @param l
	 * @return List<CiviliteDTO>
	 */
	public static List<CiviliteDTO> getCiviliteListDTO(List<Civilite> l){
		List<CiviliteDTO> ld = (l==null||l.isEmpty())?null:new ArrayList<CiviliteDTO>();
		if(l!=null){
			for(Civilite c : l){
				ld.add(new CiviliteDTO(c));
			}
		}
		return ld;
	}

	/**
	 * @param l
	 * @return List<ConfidentialiteDTO>
	 */
	public static List<ConfidentialiteDTO> getConfidentialiteListDTO(List<Confidentialite> l){
		List<ConfidentialiteDTO> ld = (l==null||l.isEmpty())?null:new ArrayList<ConfidentialiteDTO>();
		if(l!=null){
			for(Confidentialite c : l){
				ld.add(new ConfidentialiteDTO(c));
			}
		}
		return ld;
	}

	/**
	 * @param l
	 * @return List<ContactDTO>
	 */
	public static List<ContactDTO> getContactListDTO(List<Contact> l){
		List<ContactDTO> ld = (l==null||l.isEmpty())?null:new ArrayList<ContactDTO>();
		if(l!=null){
			for(Contact c : l){
				ld.add(new ContactDTO(c));
			}
		}
		return ld;
	}
	/**
	 * @param l
	 * @return List<ContratOffreDTO>
	 */
	public static List<ContratOffreDTO> getContratOffreListDTO(List<ContratOffre> l){
		List<ContratOffreDTO> ld = (l==null||l.isEmpty())?null:new ArrayList<ContratOffreDTO>();
		if(l!=null){
			for(ContratOffre c : l){
				ld.add(new ContratOffreDTO(c));
			}
		}
		return ld;
	}
	/**
	 * @param l
	 * @return List<CritereGestionDTO>
	 */
	public static List<CritereGestionDTO> getCritereGestionListDTO(List<CritereGestion> l){
		List<CritereGestionDTO> ld = (l==null||l.isEmpty())?null:new ArrayList<CritereGestionDTO>();
		if(l!=null){
			for(CritereGestion c : l){
				ld.add(new CritereGestionDTO(c));
			}
		}
		return ld;
	}
	/**
	 * @param l
	 * @return List<DroitAdministrationDTO>
	 */
	public static List<DroitAdministrationDTO> getDroitAdministrationListDTO(List<DroitAdministration> l){
		List<DroitAdministrationDTO> ld = (l==null||l.isEmpty())?null:new ArrayList<DroitAdministrationDTO>();
		if(l!=null){
			for(DroitAdministration d : l){
				ld.add(new DroitAdministrationDTO(d));
			}
		}
		return ld;
	}
	/**
	 * @param l
	 * @return List<DroitAdministrationDTO>
	 */
	public static List<DureeDiffusionDTO> getDureeDiffusionListDTO(List<DureeDiffusion> l){
		List<DureeDiffusionDTO> ld = (l==null||l.isEmpty())?null:new ArrayList<DureeDiffusionDTO>();
		if(l!=null){
			for(DureeDiffusion d : l){
				ld.add(new DureeDiffusionDTO(d));
			}
		}
		return ld;
	}
	/**
	 * @param l
	 * @return List<EffectifDTO>
	 */
	public static List<EffectifDTO> getEffectifListDTO(List<Effectif> l){
		List<EffectifDTO> ld = (l==null||l.isEmpty())?null:new ArrayList<EffectifDTO>();
		if(l!=null){
			for(Effectif e : l){
				ld.add(new EffectifDTO(e));
			}
		}
		return ld;
	}
	/**
	 * @param l
	 * @return List<FapN1DTO>
	 */
	public static List<FapN1DTO> getFapN1ListDTO(List<FapN1> l){
		List<FapN1DTO> ld = (l==null||l.isEmpty())?null:new ArrayList<FapN1DTO>();
		if(l!=null){
			for(FapN1 f : l){
				ld.add(new FapN1DTO(f));
			}
		}
		return ld;
	}
	/**
	 * @param l
	 * @return List<FapN2DTO>
	 */
	public static List<FapN2DTO> getFapN2ListDTO(List<FapN2> l){
		List<FapN2DTO> ld = (l==null||l.isEmpty())?null:new ArrayList<FapN2DTO>();
		if(l!=null){
			for(FapN2 f : l){
				ld.add(new FapN2DTO(f));
			}
		}
		return ld;
	}
	/**
	 * @param l
	 * @return List<FapN3DTO>
	 */
	public static List<FapN3DTO> getFapN3ListDTO(List<FapN3> l){
		List<FapN3DTO> ld = (l==null||l.isEmpty())?null:new ArrayList<FapN3DTO>();
		if(l!=null){
			for(FapN3 f : l){
				ld.add(new FapN3DTO(f));
			}
		}
		return ld;
	}
	/**
	 * @param l
	 * @return List<FapQualificationDTO>
	 */
	public static List<FapQualificationDTO> getFapQualificationListDTO(List<FapQualification> l){
		List<FapQualificationDTO> ld = (l==null||l.isEmpty())?null:new ArrayList<FapQualificationDTO>();
		if(l!=null){
			for(FapQualification f : l){
				ld.add(new FapQualificationDTO(f));
			}
		}
		return ld;
	}
	/**
	 * @param l
	 * @return List<FapQualificationSimplifieeDTO>
	 */
	public static List<FapQualificationSimplifieeDTO> getFapQualificationSimplifieeListDTO(List<FapQualificationSimplifiee> l){
		List<FapQualificationSimplifieeDTO> ld = (l==null||l.isEmpty())?null:new ArrayList<FapQualificationSimplifieeDTO>();
		if(l!=null){
			for(FapQualificationSimplifiee f : l){
				ld.add(new FapQualificationSimplifieeDTO(f));
			}
		}
		return ld;
	}
	/**
	 * @param l
	 * @return List<ModeCandidatureDTO>
	 */
	public static List<ModeCandidatureDTO> getModeCandidatureListDTO(List<ModeCandidature> l){
		List<ModeCandidatureDTO> ld = (l==null||l.isEmpty())?null:new ArrayList<ModeCandidatureDTO>();
		if(l!=null){
			for(ModeCandidature m : l){
				ld.add(new ModeCandidatureDTO(m));
			}
		}
		return ld;
	}
	/**
	 * @param l
	 * @return List<NafN1DTO>
	 */
	public static List<NafN1DTO> getNafN1ListDTO(List<NafN1> l){
		List<NafN1DTO> ld = (l==null||l.isEmpty())?null:new ArrayList<NafN1DTO>();
		if(l!=null){
			for(NafN1 n : l){
				ld.add(new NafN1DTO(n));
			}
		}
		return ld;
	}
	/**
	 * @param l
	 * @return List<NafN5DTO>
	 */
	public static List<NafN5DTO> getNafN5ListDTO(List<NafN5> l){
		List<NafN5DTO> ld = (l==null||l.isEmpty())?null:new ArrayList<NafN5DTO>();
		if(l!=null){
			for(NafN5 n : l){
				ld.add(new NafN5DTO(n));
			}
		}
		return ld;
	}
	/**
	 * @param l
	 * @return List<NiveauCentreDTO>
	 */
	public static List<NiveauCentreDTO> getNiveauCentreListDTO(List<NiveauCentre> l){
		List<NiveauCentreDTO> ld = (l==null||l.isEmpty())?null:new ArrayList<NiveauCentreDTO>();
		if(l!=null){
			for(NiveauCentre n : l){
				ld.add(new NiveauCentreDTO(n));
			}
		}
		return ld;
	}
	/**
	 * @param l
	 * @return List<NiveauFormationDTO>
	 */
	public static List<NiveauFormationDTO> getNiveauFormationListDTO(List<NiveauFormation> l){
		List<NiveauFormationDTO> ld = (l==null||l.isEmpty())?null:new ArrayList<NiveauFormationDTO>();
		if(l!=null){
			for(NiveauFormation n : l){
				ld.add(new NiveauFormationDTO(n));
			}
		}
		return ld;
	}
	/**
	 * @param l
	 * @return List<OffreDTO>
	 */
	public static List<OffreDTO> getOffreListDTO(List<Offre> l){
		List<OffreDTO> ld = (l==null||l.isEmpty())?null:new ArrayList<OffreDTO>();
		if(l!=null){
			for(Offre o : l){
				ld.add(new OffreDTO(o,false));
			}
		}
		return ld;
	}
	/**
	 * @param l
	 * @return List<OffreDTO>
	 */
	public static List<OffreDTO> getOffreListDTOLight(List<Offre> l){
		List<OffreDTO> ld = (l==null||l.isEmpty())?null:new ArrayList<OffreDTO>();
		if(l!=null){
			for(Offre o : l){
				ld.add(new OffreDTO(o,true));
			}
		}
		return ld;
	}
	/**
	 * @param l
	 * @return List<OffreDiffusionDTO>
	 */
	public static List<OffreDiffusionDTO> getOffreDiffusionListDTO(List<OffreDiffusion> l){
		List<OffreDiffusionDTO> ld = (l==null||l.isEmpty())?null:new ArrayList<OffreDiffusionDTO>();
		if(l!=null){
			for(OffreDiffusion o : l){
				ld.add(new OffreDiffusionDTO(o));
			}
		}
		return ld;
	}
	/**
	 * @param l
	 * @return List<PaysDTO>
	 */
	public static List<PaysDTO> getPaysListDTO(List<Pays> l){
		List<PaysDTO> ld = (l==null||l.isEmpty())?null:new ArrayList<PaysDTO>();
		if(l!=null){
			for(Pays p : l){
				ld.add(new PaysDTO(p));
			}
		}
		return ld;
	}
	/**
	 * @param l
	 * @return List<PersonnelCentreGestionDTO>
	 */
	public static List<PersonnelCentreGestionDTO> getPersonnelCentreGestionListDTO(List<PersonnelCentreGestion> l){
		List<PersonnelCentreGestionDTO> ld = (l==null||l.isEmpty())?null:new ArrayList<PersonnelCentreGestionDTO>();
		if(l!=null){
			for(PersonnelCentreGestion p : l){
				ld.add(new PersonnelCentreGestionDTO(p));
			}
		}
		return ld;
	}
	/**
	 * @param l
	 * @return List<ServiceDTO>
	 */
	public static List<ServiceDTO> getServiceListDTO(List<Service> l){
		List<ServiceDTO> ld = (l==null||l.isEmpty())?null:new ArrayList<ServiceDTO>();
		if(l!=null){
			for(Service s : l){
				ld.add(new ServiceDTO(s));
			}
		}
		return ld;
	}
	/**
	 * @param l
	 * @return List<StatutJuridiqueDTO>
	 */
	public static List<StatutJuridiqueDTO> getStatutJuridiqueListDTO(List<StatutJuridique> l){
		List<StatutJuridiqueDTO> ld = (l==null||l.isEmpty())?null:new ArrayList<StatutJuridiqueDTO>();
		if(l!=null){
			for(StatutJuridique s : l){
				ld.add(new StatutJuridiqueDTO(s));
			}
		}
		return ld;
	}
	/**
	 * @param l
	 * @return List<StructureDTO>
	 */
	public static List<StructureDTO> getStructureListDTO(List<Structure> l){
		List<StructureDTO> ld = (l==null||l.isEmpty())?null:new ArrayList<StructureDTO>();
		if(l!=null){
			for(Structure s : l){
				ld.add(new StructureDTO(s,false));
			}
		}
		return ld;
	}
	/**
	 * @param l
	 * @return List<TempsTravailDTO>
	 */
	public static List<TempsTravailDTO> getTempsTravailListDTO(List<TempsTravail> l){
		List<TempsTravailDTO> ld = (l==null||l.isEmpty())?null:new ArrayList<TempsTravailDTO>();
		if(l!=null){
			for(TempsTravail t : l){
				ld.add(new TempsTravailDTO(t));
			}
		}
		return ld;
	}
	/**
	 * @param l
	 * @return List<TypeOffreDTO>
	 */
	public static List<TypeOffreDTO> getTypeOffreListDTO(List<TypeOffre> l){
		List<TypeOffreDTO> ld = (l==null||l.isEmpty())?null:new ArrayList<TypeOffreDTO>();
		if(l!=null){
			for(TypeOffre t : l){
				ld.add(new TypeOffreDTO(t));
			}
		}
		return ld;
	}
	/**
	 * @param l
	 * @return List<TypeStructureDTO>
	 */
	public static List<TypeStructureDTO> getTypeStructureListDTO(List<TypeStructure> l){
		List<TypeStructureDTO> ld = (l==null||l.isEmpty())?null:new ArrayList<TypeStructureDTO>();
		if(l!=null){
			for(TypeStructure t : l){
				ld.add(new TypeStructureDTO(t));
			}
		}
		return ld;
	}
	/**
	 * @param l
	 * @return List<UniteDureeDTO>
	 */
	public static List<UniteDureeDTO> getUniteDureeListDTO(List<UniteDuree> l){
		List<UniteDureeDTO> ld = (l==null||l.isEmpty())?null:new ArrayList<UniteDureeDTO>();
		if(l!=null){
			for(UniteDuree u : l){
				ld.add(new UniteDureeDTO(u));
			}
		}
		return ld;
	}
	
	
	/**
	 * @param l
	 * @return List<AssuranceDTO>
	 */
	public static List<AssuranceDTO> getAssuranceListDTO(List<Assurance> l) {
		List<AssuranceDTO> ld = new ArrayList<AssuranceDTO>();
		if (l!=null) {
			for (Assurance ass : l) {
				AssuranceDTO aDTO = new AssuranceDTO(ass);
				ld.add(aDTO);
			}
		}

		return ld;
	}

	/**
	 * @param l
	 * @return List<CaisseRegimeDTO>
	 */
	public static List<CaisseRegimeDTO> getCaisseRegimeListDTO(List<CaisseRegime> l) {
		List<CaisseRegimeDTO> ld = new ArrayList<CaisseRegimeDTO>();
		if (l!=null) {
			for (CaisseRegime o : l) {
				CaisseRegimeDTO oDTO = new CaisseRegimeDTO(o);
				ld.add(oDTO);
			}
		}

		return ld;
	}


	/**
	 * @param l
	 * @return List<EnseignantDTO>
	 */
	public static List<EnseignantDTO> getEnseignantListDTO(List<Enseignant> l) {
		List<EnseignantDTO> ld = new ArrayList<EnseignantDTO>();
		if (l!=null) {
			for (Enseignant o : l) {
				EnseignantDTO oDTO = new EnseignantDTO(o);
				ld.add(oDTO);
			}
		}

		return ld;
	}
	


	/**
	 * @param l
	 * @return List<EtapeDTO>
	 */
	public static List<EtapeDTO> getEtapeListDTO(List<Etape> l) {
		List<EtapeDTO> ld = new ArrayList<EtapeDTO>();
		if (l!=null) {
			for (Etape o : l) {
				EtapeDTO oDTO = new EtapeDTO(o);
				ld.add(oDTO);
			}
		}
		
		return ld;
	}
	
	/**
	 * @param l
	 * @return List<LangueConventionDTO>
	 */
	public static List<LangueConventionDTO> getLangueConventionListDTO(List<LangueConvention> l) {
		List<LangueConventionDTO> ld = new ArrayList<LangueConventionDTO>();
		if (l!=null) {
			for (LangueConvention o : l) {
				LangueConventionDTO oDTO = new LangueConventionDTO(o);
				ld.add(oDTO);
			}
		}
		
		return ld;
	}
	
	/**
	 * @param l
	 * @return List<IndemnisationDTO>
	 */
	public static List<IndemnisationDTO> getIndemnisationListDTO(List<Indemnisation> l) {
		List<IndemnisationDTO> ld = new ArrayList<IndemnisationDTO>();
		if (l!=null) {
			for (Indemnisation o : l) {
				IndemnisationDTO oDTO = new IndemnisationDTO(o);
				ld.add(oDTO);
			}
		}
		
		return ld;
	}
	
	/**
	 * @param l
	 * @return List<NatureTravailDTO> 
	 */
	public static List<NatureTravailDTO> getNatureTravailListDTO(List<NatureTravail> l) {
		List<NatureTravailDTO> ld = new ArrayList<NatureTravailDTO>();
		if (l!=null) {
			for (NatureTravail o : l) {
				NatureTravailDTO oDTO = new NatureTravailDTO(o);
				ld.add(oDTO);
			}
		}
		
		return ld;
	}
	
	/**
	 * @param l
	 * @return List<ThemeDTO>
	 */
	public static List<ThemeDTO> getThemeListDTO(List<Theme> l) {
		List<ThemeDTO> ld = new ArrayList<ThemeDTO>();
		if (l!=null) {
			for (Theme o : l) {
				ThemeDTO oDTO = new ThemeDTO(o);
				ld.add(oDTO);
			}
		}
		
		return ld;
	}
	
	/**
	 * @param l
	 * @return List<TypeConventionDTO
	 */
	public static List<TypeConventionDTO> getTypeConventionListDTO(List<TypeConvention> l) {
		List<TypeConventionDTO> ld = new ArrayList<TypeConventionDTO>();
		if (l!=null) {
			for (TypeConvention o : l) {
				TypeConventionDTO oDTO = new TypeConventionDTO(o);
				ld.add(oDTO);
			}
		}
		
		return ld;
	}
	
	/**
	 * @param l
	 * @return  List<UfrDTO
	 */
	public static List<UfrDTO> getUfrListDTO(List<Ufr> l) {
		List<UfrDTO> ld = new ArrayList<UfrDTO>();
		if (l!=null) {
			for (Ufr o : l) {
				UfrDTO oDTO = new UfrDTO(o);
				ld.add(oDTO);
			}
		}
		
		return ld;
	}
	
	/**
	 * @param l
	 * @return List<UniteGratificationDTO>
	 */
	public static List<UniteGratificationDTO> getUniteGratificationListDTO(List<UniteGratification> l) {
		List<UniteGratificationDTO> ld = new ArrayList<UniteGratificationDTO>();
		if (l!=null) {
			for (UniteGratification o : l) {
				UniteGratificationDTO oDTO = new UniteGratificationDTO(o);
				ld.add(oDTO);
			}
		}
		
		return ld;
	}
	
	/**
	 * @param l
	 * @return List<ModeValidationStageDTO>
	 */
	public static List<ModeValidationStageDTO> getModeValidationStageListDTO(List<ModeValidationStage> l) {
		List<ModeValidationStageDTO> ld = new ArrayList<ModeValidationStageDTO>();
		if (l!=null) {
			for (ModeValidationStage o : l) {
				ModeValidationStageDTO oDTO = new ModeValidationStageDTO(o);
				ld.add(oDTO);
			}
		}
		
		return ld;
	}
	
	/**
	 * @param l
	 * @return List<ModeVersGratificationDTO>
	 */
	public static List<ModeVersGratificationDTO> getModeVersGratificationListDTO(List<ModeVersGratification> l) {
		List<ModeVersGratificationDTO> ld = new ArrayList<ModeVersGratificationDTO>();
		if (l!=null) {
			for (ModeVersGratification o : l) {
				ModeVersGratificationDTO oDTO = new ModeVersGratificationDTO(o);
				ld.add(oDTO);
			}
		}
		
		return ld;
	}
	
	/**
	 * @param l
	 * @param light 
	 * @return List<ConventionDTO>
	 */
	public static List<ConventionDTO> getConventionListDTO(List<Convention> l, boolean light) {
		List<ConventionDTO> ld = new ArrayList<ConventionDTO>();
		if (l!=null) {
			for (Convention o : l) {
				ConventionDTO oDTO = new ConventionDTO(o,light);
				ld.add(oDTO);
			}
		}
		
		return ld;
	}
	
	
	/**
	 * @param l
	 * @return List<EtudiantDTO> 
	 */
	public static List<EtudiantDTO> getEtudiantListDTO(List<Etudiant> l) {
		List<EtudiantDTO> ld = new ArrayList<EtudiantDTO>();
		if (l!=null) {
			for (Etudiant o : l) {
				EtudiantDTO oDTO = new EtudiantDTO(o,false);
				ld.add(oDTO);
			}
		}
		
		return ld;
	}
	
	/**
	 * @param l
	 * @return List<OrigineStageDTO>
	 */
	public static List<OrigineStageDTO> getOrigineStageListDTO(List<OrigineStage> l) {
		List<OrigineStageDTO> ld = new ArrayList<OrigineStageDTO>();
		if (l!=null) {
			for (OrigineStage o : l) {
				OrigineStageDTO oDTO = new OrigineStageDTO(o);
				ld.add(oDTO);
			}
		}
		
		return ld;
	}
}
