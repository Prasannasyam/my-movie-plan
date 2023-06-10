package com.MyMoviePlan.entity;

import lombok.*;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;
import java.util.List;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
@Table(name = "movies")
public class MovieEntity implements Serializable {

    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;

    @Column(length = Integer.MAX_VALUE, columnDefinition = "TEXT")
    private String image;

    @Column(name = "bg_image", length = Integer.MAX_VALUE, columnDefinition="TEXT")
    private String bgImage;

    @Column(length = 9000)
    private String story;
    @Column
    private int year;
    @Column
    private int duration;
    @Column
    private String caption;

    @Column(name = "added_on")
    @Temporal(TemporalType.DATE)
    private Date addedOn;

    @Temporal(TemporalType.DATE)
    private Date releasedate;
    @Column
    private String language;

    @ToString.Exclude
    @EqualsAndHashCode.Exclude
    @ElementCollection
    @CollectionTable(name = "movie_genres", joinColumns = @JoinColumn(name = "movie_id"))
    @Column(name = "genre")
    private List<String> genres;

    @ToString.Exclude
    @EqualsAndHashCode.Exclude
    @OneToMany(targetEntity = ActorEntity.class, cascade = CascadeType.ALL)
    @JoinColumn(name = "movie_id", referencedColumnName = "id")
    private List<ActorEntity> casts;

    @ToString.Exclude
    @EqualsAndHashCode.Exclude
    @OneToMany(targetEntity = ActorEntity.class, cascade = CascadeType.ALL)
    @JoinColumn(name = "movie_id", referencedColumnName = "id")
    private List<ActorEntity> crews;

    public MovieEntity(String name, String image, String bgImage, String story, int year,
                       int duration, String caption, Date addedOn, Date releasedate,  String language,
                       List<String> genres, List<ActorEntity> casts, List<ActorEntity> crews) {
        this.name = name;
        this.image = image;
        this.bgImage = bgImage;
        this.story = story;
        this.year = year;
        this.duration = duration;
        this.caption = caption;
        this.addedOn = addedOn;
        this.releasedate = releasedate;
        this.setLanguage(language);
        this.genres = genres;
        this.casts = casts;
        this.crews = crews;
    }

    public MovieEntity setId(int id) {
        this.id = id;
        return this;
    }

    public MovieEntity setName(String name) {
        this.name = name;
        return this;
    }

    public MovieEntity setImage(String image) {
        this.image = image;
        return this;
    }

    public MovieEntity setBgImage(String bgImage) {
        this.bgImage = bgImage;
        return this;
    }

    public MovieEntity setStory(String story) {
        this.story = story;
        return this;
    }

    public MovieEntity setYear(int year) {
        this.year = year;
        return this;
    }

    public MovieEntity setDuration(int duration) {
        this.duration = duration;
        return this;
    }

    public MovieEntity setCaption(String caption) {
        this.caption = caption;
        return this;
    }

    public MovieEntity setAddedOn(Date addedOn) {
        this.addedOn = addedOn;
        return this;
    }

    public MovieEntity setRelease(Date releasedate) {
       this.releasedate = releasedate;
       return this;
    }

    public MovieEntity setLanguages(String language) {
        this.setLanguage(language);
        return this;
    }

    public MovieEntity setGenres(List<String> genres) {
        this.genres = genres;
        return this;
    }

    public MovieEntity setCasts(List<ActorEntity> casts) {
        this.casts = casts;
        return this;
    }

    public MovieEntity setCrews(List<ActorEntity> crews) {
        this.crews = crews;
        return this;
    }

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public String getImage() {
		return image;
	}

	public String getBgImage() {
		return bgImage;
	}

    public Date getRelease() {
		return releasedate;
	}

	public String getLanguage() {
		return language;
	}

	public void setLanguage(String language) {
		this.language = language;
	}

	public int getYear() {
		return year;
	}

	public int getDuration() {
		return duration;
	}

	public String getCaption() {
		return caption;
	}

	public List<ActorEntity> getCasts() {
		return casts;
	}

	public List<ActorEntity> getCrews() {
		return crews;
	}
}
