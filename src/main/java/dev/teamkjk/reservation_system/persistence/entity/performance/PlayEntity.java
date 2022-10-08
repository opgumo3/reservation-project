package dev.teamkjk.reservation_system.persistence.entity.performance;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "play")
@DiscriminatorValue("play")
public class PlayEntity extends PerformanceEntity {

  private String location;
}